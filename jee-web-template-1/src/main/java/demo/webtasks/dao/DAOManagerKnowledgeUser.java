package demo.webtasks.dao;

import java.sql.SQLException;
import java.util.List;

import utils.ExpressionSQL;
import demo.webtasks.model.AbstractModelBean;
import demo.webtasks.model.IEntity;
import demo.webtasks.model.Knowledge;
import demo.webtasks.model.KnowledgeUser;
import demo.webtasks.services.DAOManager;
import demo.webtasks.services.mocks.EntityDAO;

public class DAOManagerKnowledgeUser implements DAOManager<KnowledgeUser> {

	public void add(KnowledgeUser knowledgeUser) throws InstantiationException,
			IllegalAccessException, SQLException {
	//	KnowledgeUser knowledgeUser = (KnowledgeUser) obj;
		Object[] objects = { knowledgeUser.getKnowledgeId(),
				knowledgeUser.getUserId() };
		EntityDAO.listEntities(ExpressionSQL.ADD_KNOWLEDGE_USER, objects,
				KnowledgeUser.class);

	}



	@Override
	public void delete(KnowledgeUser obj) throws InstantiationException,
			IllegalAccessException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(KnowledgeUser obj) throws InstantiationException,
			IllegalAccessException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public KnowledgeUser get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<KnowledgeUser> getAll() throws InstantiationException,
			IllegalAccessException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
