public interface State {
    int getNum();
    Operation getOperation();
    void increaseDifficulty();
    void decreaseDifficulty();
}

