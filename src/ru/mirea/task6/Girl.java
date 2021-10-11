package ru.mirea.task6;

class Buy implements Nameable {
    private String football;
    Buy(String football) {
        this.football = football;
    }
    public void play() {
        System.out.println("Куплен клуб ");
        System.out.println(football);
    }

}

