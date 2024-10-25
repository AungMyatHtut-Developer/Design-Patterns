package com.amh.strategry_pattern.good_design.enemy;

import com.amh.strategry_pattern.good_design.bird.bird_behavior.ChirpBehavior;

public class Hunter {

    ChirpBehavior chripBehavior;

    public void callBird() {
        chripBehavior.chirp();
    }

    public void setBird(ChirpBehavior ChirpBehavior) {
        this.chripBehavior = ChirpBehavior;
    }

}
