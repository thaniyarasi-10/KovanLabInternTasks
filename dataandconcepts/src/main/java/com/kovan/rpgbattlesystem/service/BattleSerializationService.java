package com.kovan.rpgbattlesystem.service;

import com.kovan.rpgbattlesystem.model.Character;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class BattleSerializationService {
    private static final String saveFile = "data.dat";

    // we're only saving the file, so no return type
    public  void saveGame(Character character){
        try(
                FileOutputStream fileOutputStream = new FileOutputStream(saveFile);
                ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(character);
        }
        catch (IOException e){
            throw new RuntimeException("Failed to save game" + e);
        }

    }

    // returning the file
    public Character loadGame(){
        try(
                FileInputStream fileInputStream= new FileInputStream(saveFile);
                ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream)
                ) {
                    return (Character) objectInputStream.readObject();
        } catch (Exception e) {
            throw new RuntimeException("Error while loading"+e);
        }

    }
}
