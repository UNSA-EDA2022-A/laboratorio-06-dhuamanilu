package com.example.project;

public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstIguales(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstIguales(BST<T> a1, BST<T> a2){
    	//Se empieza a analizar desde la raiz de ambos árboles
        return bstIguales(a1.root,a2.root);
    }
    public <T extends Comparable<T>> boolean bstIguales(Node<T> a1, Node<T> a2){
    	//Reutilizemos el código del ejercicio 1
    	//Si ambos estan vacios,son iguales
    	if(a1==null && a2==null) 
    		return true;
    	//Si uno de los nodos es nulo y el otro tiene algun valor significa que no son iguales
    	else if(a1!=null && a2==null || (a1==null && a2!=null)) 
    		return false;
    	//Sino entonces verificamos la igualdad para sus subárboles izquierdos  y derechos 
        return a1.data.compareTo(a2.data)==0 && bstIguales(a1.left,a2.left) && bstIguales(a1.right,a2.right);
    }
}
