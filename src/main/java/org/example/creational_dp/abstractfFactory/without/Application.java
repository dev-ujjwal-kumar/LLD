package org.example.creational_dp.abstractfFactory.without;
class WindowsButton{
    public void render(){
        // business logic
        System.out.println("Rendering windows page");
    }
}

class WindowsScrollBar{
    public void render(){
        // Business logic
        System.out.println("Rendering Windows Scroll Bar");
    }
}

class MacOSButton{
    public void render(){
        // business logic
        System.out.println("Rendering MacOS page");
    }
}

class MacOSScrollBar{
    public void render(){
        // Business logic
        System.out.println("Rendering MacOS Scroll Bar");
    }
}
public class Application {
    public static void main(String[] args) {
        // Windows UI
        WindowsButton windowsButton = new WindowsButton();
        WindowsScrollBar windowsScrollBar = new WindowsScrollBar();

        windowsButton.render();
        windowsScrollBar.render();

    }
}
