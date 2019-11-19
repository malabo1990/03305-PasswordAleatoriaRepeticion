/* 
 * Copyright 2019 Casimiro Ondo Obiang.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Casimiro Ondo Obiang casimiro.ondo.alum@iescamp.es
 */
public class Main {
    public static final Random RDM= new Random();
    public static void main(String[] args) {
        //ejercicio 03305-PasswordAlteatoriaRepeticion
        //Constante
        final char LETRA_INICIO= 'A';
        final char LETRA_FINAL= 'Z';
        final int N_INICIO =0;
        final int N_FINAL = 8;
       
        //variable
       //bucle
       for(int i=N_INICIO; i<N_FINAL; i++){
           char password = (char)(RDM.nextInt(LETRA_FINAL-LETRA_INICIO+1)+LETRA_INICIO);
           System.out.printf("Password %d....: %c%n", i, password);
       }
    }
}
