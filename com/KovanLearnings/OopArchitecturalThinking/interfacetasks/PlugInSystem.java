package com.KovanLearnings.OopArchitecturalThinking.Interface;


interface Plugin{
    void execute();
}

class  CoreSystem{
    Plugin [] plugins;

    public  CoreSystem(Plugin[] value){
        this.plugins = value;
    }

    public void runPlugins(){
        for(Plugin p: plugins){
            p.execute();
        }
    }
}
public class PlugInSystem {
    public static void main() {

        Plugin [] plugins = new Plugin[]{
                new Plugin(){
                    @Override
                    public void execute(){
                        System.out.println("Loggin plugin");
                    }
                },
                new Plugin() {
                    @Override
                    public void execute() {
                        System.out.println("Security plugin");
                    }
                },
                new Plugin() {
                    @Override
                    public void execute() {
                        System.out.println("Auth plugin");
                    }
                }
        };

        CoreSystem coreSystem= new CoreSystem(plugins);
        coreSystem.runPlugins();
    }


}
