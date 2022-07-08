package collections;

public class Usuario implements Comparable<Usuario>{
	private int idUsuario;
	private String nomeUsuario;
	private String senhaUsuario;
	
	public Usuario(int idUsuario, String nomeUsuario, String senhaUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.senhaUsuario = senhaUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	@Override
	public int compareTo(Usuario user) {
		
		if(this.getIdUsuario()<user.getIdUsuario()) {
			return -1;
	} 
	if (this.getIdUsuario()>user.getIdUsuario()) {
		return 1;
	}
	return 0;
	}
}
