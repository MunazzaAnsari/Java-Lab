class Wolf extends Canine {
    public void makenoise(String s) {
        sound = s;
        System.out.println("the sound that animal make" + sound);

    }

    public void eat(String h, String f) {
        food = f;
        hunger = h;
        System.out.println("type of food animal eat" + food + "hunger type" + hunger);

    }

}