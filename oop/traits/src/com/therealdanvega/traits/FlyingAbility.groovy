package com.therealdanvega.traits

trait FlyingAbility {
	
	String location

    String fly(){
        "I'm Flying at $location!"
    }

    private String bar() {
        "bar"
    }
}