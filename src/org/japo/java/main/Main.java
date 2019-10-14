/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
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
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        //Constantes
        final double CUOTA_NETFLIX = 30.00;
        //Variables
        double cuotaA;
        double cuotaB;
        //Random
        cuotaA = RND.nextDouble() * (CUOTA_NETFLIX - 0) + 0;
        cuotaB = CUOTA_NETFLIX - cuotaA;
        //Mensajes
        System.out.printf("Cuota del Amigo A: %.2f%n", cuotaA);
        System.out.printf("Cuota del Amigo B: %.2f%n", cuotaB);
        System.out.printf("Suma de los dos amigos : %.0f%n", CUOTA_NETFLIX);
    }
}