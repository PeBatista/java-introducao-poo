package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class teste {

	public static void main(String[] args) {
		List<Usuario> Lista = new ArrayList<Usuario>();
		Usuario userP, userA, userV, userR, userPa;
		Lista.add(userP = new Usuario(1, "Pedro", "12345")); //LISTA DE ARRAY ONDE add e de caraINSTANCIAMOS os dados  
		Lista.add(userA = new Usuario(4, "Augusto", "12355"));
		Lista.add(userV = new Usuario(5, "Victor", "11345"));
		Lista.add(userR = new Usuario(3, "Rafael", "12445"));
		Lista.add(userPa = new Usuario(2, "Pablo", "13345"));
		
		Collections.sort(Lista);
		
		for (Usuario user : Lista) {
			System.out.println("Dados de sua lista: " + user.getNomeUsuario() + " e " + user.getIdUsuario());
		}
		
		Map mapa = new HashMap();
		mapa.put("Pedro", userP);
		mapa.put("Pablo", userPa);
		mapa.put("Victor", userV);
		mapa.put("Augusto", userA);
		mapa.put("Rafael", userR);
		
		
		
		for(Object user: mapa.keySet()) {
			Object objeto = mapa.get("Victor");
			Usuario usuario = (Usuario) objeto; // INSTANCIANDO OBJETO usuario para pegarmos o DADO CERTO
			System.out.println(usuario.getNomeUsuario());
		}
	}
}
