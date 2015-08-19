package me.tedder

class Cat {
    String name

    enum CoatColor {
        tabby, tortie
    }
}

// enums aren't alternately serializable- they are inherently serializable.
//@SuppressWarnings('SerializableClassMustDefineSerialVersionUID')
enum CatType {
    indoor, outdoor
}
