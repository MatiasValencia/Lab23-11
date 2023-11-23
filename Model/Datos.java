package Model;

import java.io.*;
import java.util.ArrayList;

public class Datos {
    private ArrayList<Pokemon> listaPokemon;
    private String ubicacionArchivo;
    public Datos(String ubicacionArchivo) {
        this.listaPokemon = new ArrayList<>();
        this.ubicacionArchivo = ubicacionArchivo;
    }
    public ArrayList<String> listaPokemonString() {
        ArrayList<String> aux = new ArrayList<>();
        for (Pokemon p : listaPokemon) {
            aux.add(p.toString());
        }
        return aux;
    }
    public ArrayList<Pokemon> leerDatos() {
        ArrayList<Pokemon> listaPokemon = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(ubicacionArchivo));
            String linea;
            Pokemon aux = new Pokemon();
            while((linea = br.readLine()) != null) {
                String [] pokemon = linea.split(",");
                aux.setNombre(pokemon[0]);
                aux.setTipo(pokemon[1]);
                aux.setNivel(Integer.valueOf(pokemon[2]));
                listaPokemon.add(aux);
            }
            br.close();
        } catch(Exception e) {
            System.out.println("Archivo no encontrado.");
        }
        return listaPokemon;
    }

}
