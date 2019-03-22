package com.hm.jdbc;

public class ArticleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArticleDao articleDao =new ArticleDaoImplUsingRawJdbc();
		Article article = articleDao.getArticle("1");
		System.out.println(article);

	}

}
