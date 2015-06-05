package utils;

import java.util.Date;

import demo.annotation.Column;

public class ExpressionSQL {
	// KNOWLEDGE_USER

	public static final String ADD_KNOWLEDGE_USER = "INSERT INTO knowledge_user(knowledgeId, userId) VALUES(?,?)";

	// USER
	public static final String ADD_CLIENT = "INSERT INTO user(email, password, name, roleId, securiteNumber, telephone, lastName) VALUES(?,?,?,?,?,?,?)";
	public static final String DELETE_CLIENT = "DELETE FROM user WHERE id=?";
	public static final String UPDATE_CLIENT = "UPDATE user SET email=?, name=?, password=?, isActive=? WHERE id=?";
	public static final String UPDATE_CLIENT_SECURITY_NUMBER = "UPDATE user SET securiteNumber=? WHERE email=?";
	public static final String GET_ALL_CLIENT = "SELECT * FROM user";
	public static final String GET_LOGIN_CLIENT = "SELECT * FROM user WHERE email=?";
	public static final String GET_CLIENT_BY_ID = "SELECT * FROM user WHERE id=?";

	// RESUME
	public static final String ADD_RESUME = "INSERT INTO resume(experienceAge, education, driveLicense, qualifications, workExperience, professionalSummary, vacancyId) VALUES(?,?,?,?,?,?,?)";
	public static final String DELETE_PRODUCT = "DELETE FROM product WHERE id=?";
	public static final String UPDATE_PRODUCT = "UPDATE product SET description=?, photo=?, name=?, KNOWLEDGE_id=?, price_purchase=?, price_sale=?, count=? WHERE id=?";
	public static final String GET_ALL_PRODUCT = "SELECT * FROM product";
	public static final String GET_RESUME_BY_USER_ID = "SELECT * from resume where resume.id=(SELECT user.resumeId from user where user.id=?)";
	// public static final String GET_LOGIN_ =
	// "SELECT * FROM client WHERE email=?";

	// ORDER
	public static final String ADD_ORDER = "INSERT INTO `order`(id_client, id_product, date_order, discount, type_delivery, isPayed, isDeliveried, address) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
	public static final String GET_ALL_ORDER_BY_CLIENT = "SELECT `order`.id, product.photo, product.name, `order`.date_order, `order`.discount, `order`.type_delivery, `order`.isPayed, `order`.isDeliveried, `order`.address FROM `order` INNER JOIN product ON`order`.id_product=product.id WHERE `order`.id_client=?";
	public static final String GET_ALL_ORDER = "SELECT * FROM `order`";
	public static final String DELETE_ORDER = "DELETE FROM `order` WHERE id=?";
	public static final String GET_ORDER_BY_ID = "SELECT * FROM `order` WHERE id=?";
	public static final String UPDATE_ORDER = "UPDATE `order` SET id_client=?, id_product=?, date_order=?, discount=?, type_delivery=?, isPayed=?, isDeliveried=?, address=? WHERE id=?";

	// ROLE
	public static final String GET_ROLE_ID = "SELECT id FROM role WHERE name=?";

	// KNOWLEDGE
	public static final String GET_ALL_KNOWLEDGE = "SELECT * FROM knowledge";
	public static final String DELETE_KNOWLEDGE = "DELETE FROM KNOWLEDGE WHERE id=?";
	public static final String GET_KNOWLEDGE_BY_USER_ID = "select * from knowledge where knowledge.id in (select knowledge_user.knowledgeId from knowledge_user where knowledge_user.userId=?)";
	public static final String UPDATE_KNOWLEDGE = "UPDATE KNOWLEDGE SET name=?, photo=? WHERE id=?";

	// VACANCY
	public static final String GET_ALL_VACANCY = "SELECT * FROM vacancy";
	public static final String GET_VACANCY_BY_ID = "SELECT * FROM vacancy where id=?";
	public static final String DELETE_COMMENT = "DELETE FROM comment WHERE id=?";
	public static final String GET_COMMENT_BY_ID = "SELECT * FROM comment WHERE id=?";
	public static final String UPDATE_COMMENT = "UPDATE comment SET id_client=?, id_product=?, date=?, text=? WHERE id=?";

	// PRODUCT LIST
	public static final String GET_ALL_PRODUCTLIST = "SELECT * FROM productlist";

}
