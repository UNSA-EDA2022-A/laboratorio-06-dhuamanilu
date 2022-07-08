package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2){
    	//Dos ABB son SIMILARES si tienen la misma distribución de nodos
    	//(independientemente de sus valores)
    	//utilizamos la raiz de ambos arboles en el comienzo del metodo recursivo
    	return bstSimilares(a1.root,a2.root);
    }
    public <T extends Comparable<T>> boolean bstSimilares(Node<T> a1, Node<T> a2){
    	//En una definición más formal, dos ABB son
    	//SIMILARES si ambos están vacíos
    	if(a1==null && a2==null) 
    		return true;
    	//Si uno de los nodos es nulo y el otro tiene algun valor significa que no son similares
    	else if(a1!=null && a2==null || (a1==null && a2!=null)) 
    		return false;
    	//Si sus subárboles izquierdos son similares y
    	//sus subárboles derechos también son similares.
        return bstSimilares(a1.left,a2.left) && bstSimilares(a1.right,a2.right);
    }
}
