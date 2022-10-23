package com.dsa.dsa.ds.maps;

public class WorkingWithHashTable {
    public static void main(String[] args) {

    }

    void usingHashTables(){
        /*
        HashTable - Just an array coupled with hash function
                  - Offers fast search and insertion
                  - Limited to size ('Array')

                  Working:
                  Assuming you have elements you want to store and represent in an array
                  e.g. Paul - 29
                      Frida - 16
                      Anna - 21
                      Fred - 25

                      You can have an array which you store these elements.
                      Array size = 10. To get the indexes for the elements we can do this

                      Paul is 29 so 29 mod arr.size = 10 -> 9 and do same for all elements

                      This is done by using hash functions e.g. djb2 hashing algorithm
                      - A hash function will return a non-negative integer called hash code
                      - all hash functions should be
                                - fast to compute
                                - avoid collisions
                                        - Done by chaining
                                            - Insertion 0(1)
                                            - Search 0(n) or 0(1)
                      - Other techniques - Open addressing
                                         - Linear probing - tries to put the element in the next available space
                                           linear probing is prone to clustering
                                           this is avoided using chaining (most effective way)
                                         - Double hashing

         */
    }
}
