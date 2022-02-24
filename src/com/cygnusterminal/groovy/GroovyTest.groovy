package com.cygnusterminal.groovy

class GroovyTest {

    static void main(def args) {
        def count = 0, MAXSIZE = 3
        new File("haiku.txt").withReader { reader ->
            while (reader.readLine()) {
                if (++count > MAXSIZE) {
                    throw new RuntimeException('Haiku should only have 3 verses')
                }
            }
        }
    }
}
