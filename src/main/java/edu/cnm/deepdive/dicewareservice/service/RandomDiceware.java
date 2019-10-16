package edu.cnm.deepdive.dicewareservice.service;

import org.springframework.stereotype.Service;

@Service
public class RandomDiceware {

  private final PassphraseGenerator generator;

  public RandomDiceware(PassphraseGenerator generator) {
    this.generator = generator;
  }

}
