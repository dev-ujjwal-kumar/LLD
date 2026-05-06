package org.example.creational_dp.abstractfFactory.without;
class WindowsButton{
    public void render(){
        // business logic
        System.out.println("Rendering windows page");
    }
}

class WindowsScrollBar{
    public void scroll(){
        // Business logic
        System.out.println("Scrolling Windows Scroll Bar");
    }
}

class MacOSButton{
    public void render(){
        // business logic
        System.out.println("Rendering MacOS page");
    }
}

class MacOSScrollBar{
    public void scroll(){
        // Business logic
        System.out.println("Scrolling MacOS Scroll Bar");
    }
}
public class Application {
    public static void main(String[] args) {
        // Windows UI
        WindowsButton windowsButton = new WindowsButton();
        WindowsScrollBar windowsScrollBar = new WindowsScrollBar();
        

        windowsButton.render();
        windowsScrollBar.scroll();

    }
}
