package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){
    	//Misma lógica usada en los anteriores ejercicios,empezamos el metodo recursivo desde la raiz
        return bstEstrictamenteBinario(a.root);
    }
    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(Node<T> a){
    	//Si el nodo actual esta vacio,entonces es estrictamente binario
    	if(a==null) 
    		return true;
    	//Sino entonces los nodos hijos del nodo actual tienen que tener la misma "paridad" , ambos tienen que ser null
    	//o ambos diferente de null,es decir,no hay ningun nodo con 1 solo hijo
    	boolean c1= (a.left==null && a.right==null);
    	boolean c2= (a.left!=null && a.right!=null);
    	return  (c1 || c2) && bstEstrictamenteBinario(a.left) && bstEstrictamenteBinario(a.right);
    }
}
