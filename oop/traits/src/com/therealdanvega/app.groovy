package com.therealdanvega

import com.therealdanvega.traits.Bird

//Public and private (because traits let you access private fields) field names are remapped, to avoid the diamond problem.
//properties are not remapped

//Bird b = new Bird(name: 'Canary', age: 1, location: 'Shanghai')
Bird b = new Bird(com_therealdanvega_traits_SpeakingAbility__name: 'Canary', com_therealdanvega_traits_SpeakingAbility__age: 1, location: 'Shanghai')
assert b.fly() == "I'm Flying at Shanghai!"
assert b.speak() == "Canary 1 is speaking!"

