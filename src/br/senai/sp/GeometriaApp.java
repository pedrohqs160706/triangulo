package br.senai.sp;

import br.senai.sp.model.Triangulo;

public class GeometriaApp {

	public static void main(String[] args) {
		
		// criando triangulo
		System.out.println("Criando T1...");
    Triangulo t1 = new Triangulo();    
    System.out.println("Criando T2...");
	Triangulo t2 = new Triangulo();
	System.out.println("Criando T3...");
	   System.out.println("   ");
	Triangulo t3 = new Triangulo();
	
	
	
	// definindo as dimenções dos tringulos 
	
	t1.base = 20;
	t1.ladoB = 15;
	t1.ladoC = 15;
	t1.altura = 12;
	t1.nome = "Triângulo 001";
	
    System.out.println("T1");

    System.out.println("Base: " + t1.base);
    System.out.println("Lado B: " + t1.ladoB);
    System.out.println("Lado C: " + t1.ladoC);
    System.out.println("Altura: " + t1.altura);
    System.out.println("    ");
    
    System.out.println(".........................................................................................................................................................................");
    
    t2.base = 10;
	t2.ladoB = 6;
	t2.ladoC = 8;
	t2.altura = 8;
	t2.nome = "Triângulo 002";
	
	    t3.base = 18;
		t3.ladoB = 20;
		t3.ladoC = 21;
		t3.altura = 14;
		t3.nome = "Triângulo 003";
	
	//Mostrar Dimensões dos Triangulos
	t1.mostrarDimensoes();
	
	t2.mostrarDimensoes();
	
	t3.mostrarDimensoes();
   
	
	}

}
