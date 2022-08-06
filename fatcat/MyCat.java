import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        if (isHungry() == true){
            eat();
        }
        if (isSleepy() == true){
            sleep(3);
            shoutHooray();
        }else{
            shoutHooray();
        }
        if (isBored() == true){
            dance();
            sleep(2);
        }
        if (isAlone() == true){
            sleep(4);
        }
        if (hasCompany() == true){
            shoutHooray();
        }
        
        /**
         * eat();
        dance();
        sleep(2);
        eat();
        walkLeft(3);
        walkRight(4);
        shoutHooray();
        wait(3);
        walkLeft(1);
        */
    }    
}
