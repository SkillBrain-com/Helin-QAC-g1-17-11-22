package org.skillbrain.cristianLuca.Tema2.Tema2ex4;

/*Definiti un array de char-uri. Iterati array-ul folosind structura for,
 si afisati pe ecran cate al doilea caracter din sir.*/
public class Main {
    public static void main(String[] args) {
        char[] array = {'a', 'e', 'i', 'o', 'm', 'n'};
        for (int index = 1; index < array.length; index += 2) {
            System.out.println(array[index]);
        }

    }
}