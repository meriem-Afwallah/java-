package hello;

import java.util.Objects;

public class Commande {
	// variables d'instance
	private Article[] articles;
	
	// constructeurs
	public Commande(int nbMaxArticlesDansPanier) {
		this.articles = new Article[nbMaxArticlesDansPanier];
	}
	
	// m�thodes
	
	// getters / setters
	public Article[] getArticles() {
		return articles;
	}

	/**
	 * Ajoute un article � la commande
	 * @param article � rajouter � la commande
	 * @throws NullPointerException si article est null
	 */
	public void addArticle(Article article) {
		Objects.requireNonNull(article);
		
//		if(article == null) {
//			throw new NullPointerException("L'article ne peut pas �tre null");
////			// �viter throw new IllegalArgumentException("L'article ne peut pas �tre null");
//		}

		for (int i = 0; i < articles.length; i++) {
			if(articles[i] == null) {
				articles[i] = article;
				return ; // or break;
			}
		}
	}

	public double computeTotal() {
		double total = 0;
		for (int i = 0; i < articles.length; i++) {
			if(articles[i] != null) {
				total += articles[i].getPrix();
			}
		}
		return total;
	}

}
