package demo.webtasks.services.mocks;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import demo.annotation.Column;
import demo.webtasks.model.IEntity;
import demo.webtasks.model.User;
import demo.webtasks.services.IClosable;
import utils.FactoryConnection;

public class EntityDAO {
	private FactoryConnection factory = new FactoryConnection();
	//
	// static {
	// try {
	// Class.forName("org.mariadb.jdbc.Driver");
	// } catch (ClassNotFoundException e) {
	//
	// e.printStackTrace();
	// }
	// }
	public static List<? extends IEntity> listEntities(String sql,
			Object[] obj, Class<? extends IEntity> classEntity)
			throws SQLException, InstantiationException, IllegalAccessException {
		Connection con=null;
		try {
			con = FactoryConnection.getConection();
		
			PreparedStatement pst = con.prepareStatement(sql);
			if (obj != null) {
				for (int i = 0; i <obj.length; i++) {
					pst.setObject(i+1, obj[i]);//"sveta@gmail.com"
				}
			}
			ResultSet rs=pst.executeQuery();
			List<IEntity> rez=new ArrayList<IEntity>();
			while(rs.next()){
				IEntity entity=classEntity.newInstance();
				Field[] fields=classEntity.getDeclaredFields();
				for(Field f: fields){
					f.setAccessible(true);
					if(!Modifier.isStatic(f.getModifiers())){

						Column column=f.getAnnotation(Column.class);
						String dbColumn=null;
						if(column!=null){
							dbColumn=column.value();
						}
						else{
							dbColumn=f.getName();
						}
						Object value=rs.getObject(dbColumn);
						f.set(entity, value);
						
					}
					
				}
				rez.add(entity);
			}
			return rez;
			
		} finally{
			if(con!=null){
				con.close();
			}
		}
		
	}
	

}
