package br.com.loja.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
		@ElementCollection
		private List<Preco>precos;
		
		

	 	public List<Preco> getPrecos() {
			return precos;
		}

		public void setPrecos(List<Preco> precos) {
			this.precos = precos;
		}

		private String titulo;
	    private String descricao;
	    private int paginas;

	    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int id;
	    
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getTitulo() {
	        return titulo;
	    }
	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }
	    public String getDescricao() {
	        return descricao;
	    }
	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }
	    public int getPaginas() {
	        return paginas;
	    }
	    public void setPaginas(int paginas) {
	        this.paginas = paginas;
	    }

	    @Override
	    public String toString() {
	        return "Produto [titulo=" + titulo + ", descricao=" + descricao + ", paginas=" + paginas + "]";
	    }
}
