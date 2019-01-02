package com.therealdanvega.traits

trait SpeakingAbility {

    public String name
    private String age

    String speak(){
        "$name $age is speaking!"
    }
	
	abstract String foo()

}