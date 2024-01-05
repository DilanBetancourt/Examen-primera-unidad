/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.publishing_inc;

/**
 *
 * @author dilan
 */

import java.util.List;

public class Publishing_Inc {
    
    public static void main(String[] args) {
        // Crear un programador
        Programador programador = new Programador("Alberto", "Programador", "1711417782", 24, "albert123@email.com", "09849187655", List.of("c++","Java", "Python"));
        programador.mostrarInformacion();
        System.out.println("---------");

        IlustradorGrafico ilustrador = new IlustradorGrafico("Fabian", "Ilustrador Grafico", "1150084798", 51, "fabi1972@email.com", "09876543470", List.of("Photoshop","Canva"));
        ilustrador.mostrarInformacion();
        System.out.println("---------");

        Gerente gerente = new Gerente("Luis", "Gerente", "050447879", 32, "Lucho@email.com", "0953784569", List.of(programador, ilustrador));
        gerente.mostrarInformacion();
        System.out.println("---------");

        Editor editor = new Editor("Emanuel", "Editor", "1145772433", 21, "EmuRodriguez@email.com", "0985475606", "Electronico");
        editor.mostrarInformacion();
        System.out.println("---------");
   }
}

