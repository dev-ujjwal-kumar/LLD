package org.example.creational_dp.abstractfFactory.with;

class WindowsButton implements Button{
    @Override
    public void render(){
        // business logic
        System.out.println("Rendering windows page");
    }
}

class WindowsScrollBar implements ScrollBar{
    @Override
    public void scroll(){
        // Business logic
        System.out.println("Scrolling Windows Scroll Bar");
    }
}

class MacOSButton implements Button{
    @Override
    public void render(){
        // business logic
        System.out.println("Rendering MacOS page");
    }
}

class MacOSScrollBar implements ScrollBar{
    @Override
    public void scroll(){
        // Business logic
        System.out.println("Scrolling MacOS Scroll Bar");
    }
}

class MacOSFactory implements UIFactory{
    @Override
    public ScrollBar createScrollbar() {
        // Business logic
        return new MacOSScrollBar();
    }

    @Override
    public Button createButton() {
        // Business logic
        return new MacOSButton();
    }
}

class WindowsFactory implements UIFactory{

    @Override
    public ScrollBar createScrollbar() {
        // Business logic
        System.out.println("Windows scroll bar");
        return new WindowsScrollBar();
    }

    @Override
    public Button createButton(){
        // Business logic
        System.out.println("Windows Button");
        return new MacOSButton();
    }
}
public class Application {
    private Button button;
    private ScrollBar scrollBar;

    public Application(UIFactory uiFactory){
        this.button = uiFactory.createButton();
        this.scrollBar = uiFactory.createScrollbar();
    }

    public void renderUI(){
        button.render();
        scrollBar.scroll();
    }
    public static void main(String[] args) {
        // Use Windows UI
        UIFactory windowsFactory = new WindowsFactory();
        Application app = new Application(windowsFactory);
        app.renderUI();

        //
        Application app1 = new Application(new MacOSFactory());
        app1.renderUI();

    }
}