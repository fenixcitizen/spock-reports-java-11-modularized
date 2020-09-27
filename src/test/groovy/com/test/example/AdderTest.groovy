package com.test.example

import spock.lang.Specification

class AdderTest extends Specification {

    def "A test"(def a, def b, def result) {
        given: "we have a and b"
        expect: "com.test.example.Adder adds..."
        new Adder().add(a, b) == result
        where: "Inputs below are used"
        a | b | result
        1 | 2 | 3
        3 | 5 | 8
    }

}
