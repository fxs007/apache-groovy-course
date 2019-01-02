find . -name "*.class" -exec rm {} \;

groovyc com/therealdanvega/traits/FlyingAbility.groovy 
groovyc com/therealdanvega/traits/SpeakingAbility.groovy 
groovyc com/therealdanvega/traits/Bird.groovy           
groovyc com/therealdanvega/app.groovy        
groovy com/therealdanvega/app

find . -name "*.class"
