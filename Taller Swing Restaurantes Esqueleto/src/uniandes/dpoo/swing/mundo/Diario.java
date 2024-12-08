package uniandes.dpoo.swing.mundo;

import java.util.ArrayList;
import java.util.List;

public class Diario {
    private List<Restaurante> restaurantes;

    public Diario() {
        this.restaurantes = new ArrayList<>();
    }

    public List<Restaurante> getRestaurantes(boolean completos) {
        if (completos) {
            return new ArrayList<>(restaurantes);
        } else {
            List<Restaurante> visitados = new ArrayList<>();
            for (Restaurante r : restaurantes) {
                if (r.isVisitado()) {
                    visitados.add(r);
                }
            }
            return visitados;
        }
    }

    public void agregarRestaurante(Restaurante restaurante) {
        this.restaurantes.add(restaurante);
    }
}

