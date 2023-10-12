package entidades;

public class Usuario {
	private Integer id;
	private String login;
	private String senha;
	private String nome;
	private String ativo;
	private Integer dataNascimento;
	private Integer dataCadastro;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public Integer getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Integer dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Integer getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Integer dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	

}
