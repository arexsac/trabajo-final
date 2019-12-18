package com.senati.vistas;

import com.senati.controlador.*;
import com.senati.entidades.*;
import java.util.Scanner;

public class AppAutores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer =new Scanner (System.in);
		ListaArrays ListaAutor = new ListaArrays();
		Autor Op;
		int pos;
		String ced,nom;
		int op;
		
		do {
			System.out.println("\n Menu");
			System.out.print("\n 1. Ingresar datos");
			System.out.print("\n 2. Modificar datos");
			System.out.print("\n 3. Eliminar datos");
			System.out.print("\n 4. Buscar datos");
			System.out.print("\n 5. Imprimir Lista");
			System.out.print("\n 6. Salida");
			System.out.print("\n Escoja una opcion: ");
			op =leer.nextInt();
			
			switch(op) {
			case 1:
				Op = new Autor();
				System.out.println("Ingrese la dedula :");
				ced = leer.next();
				System.out.println("Ingrese el nombre :");
				nom = leer.next();
				Op.setCedula(ced);
				Op.setNombre(nom);
				ListaAutor.Add(Op);
				break;
			case 2:
				if(ListaAutor.Count()>0) {
					Op = new Autor();
					System.out.println("Posicion a modificar" + " 0 -"+(ListaAutor.Count()-1));
					pos= leer.nextInt();
					System.out.println("Ingrese la cedula ");
					ced = leer.next();
					System.out.println("Ingrese el nombre :");
					nom = leer.next();
					Op.setCedula(ced);
					Op.setNombre(nom);
					ListaAutor.Edit(Op,pos);
				}else {
					System.out.print("Lista vacia");
				}
				break;
			case 3:
				if (ListaAutor.Count()>0) {
					System.out.println("Posicion a eliminar" + "0 -"+(ListaAutor.Count()-1));
					pos=leer.nextInt();
					ListaAutor.Delete(pos);
				}else {
					System.out.print("Lista vacia");
				}
				break;
			case 4:
				if (ListaAutor.Count()>0) {
					System.out.println("Cedula a buscar ");
					ced=leer.next();
					pos =ListaAutor.buscar(ced);
					if (pos >=0);
						System.out.println("Autor encontrado en la posicion " + pos);
						System.out.println(ListaAutor.get_autor(pos).toString());
					}else {
					System.out.print("Lista vacia");
				}
				break;
			case 5:
				System.out.println("Cedula \t \t Nombre ");
				System.out.println("--------------------");
				ListaAutor.ImprimirLista();
				break;
			case 6:
				System.out.println("Gracias por participar");
				break;
			}
		}while(op!=6);
	}

	}
