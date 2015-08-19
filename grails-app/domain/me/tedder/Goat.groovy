package me.tedder

class Goat {
    String name

    enum CoatColor {
        brown, black
    }
}

// enums aren't alternately serializable- they are inherently serializable.
//@SuppressWarnings('SerializableClassMustDefineSerialVersionUID')
enum GoatType {
    mountain, drunk
}
