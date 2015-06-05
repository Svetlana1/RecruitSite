package demo.webtasks.actions.admin.category;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.webtasks.actions.AbstractWebtasksServletHandler;
import demo.webtasks.dao.DAOManagerKnowledge;

public class AddItionCategoryServletHandler {// extends
// AbstractWebtasksServletHandler {
//
// @Override
// protected void handleRequest(HttpServletRequest request,
// HttpServletResponse response) throws Exception {
// String id = request.getParameter("id");
// String name = request.getParameter("name");
// String photo = request.getParameter("photo");
// DAOManagerCategory daoCategory = new DAOManagerCategory();
// if (id == null) {
// Category category = new Category(name, photo);
// daoCategory.add(category);
// } else {
// Category category=daoCategory.get(new Integer(id));
// category.setName(name);
// category.setPhoto(photo);
// daoCategory.update(category);
// }
// redirectRequest("/admin/categories.php", request, response);
//
// }

}
