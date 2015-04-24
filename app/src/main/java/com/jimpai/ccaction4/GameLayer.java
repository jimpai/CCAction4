package com.jimpai.ccaction4;

import org.cocos2d.actions.base.CCRepeatForever;
import org.cocos2d.actions.interval.CCFadeIn;
import org.cocos2d.actions.interval.CCFadeOut;
import org.cocos2d.actions.interval.CCMoveTo;
import org.cocos2d.actions.interval.CCRepeat;
import org.cocos2d.actions.interval.CCSequence;
import org.cocos2d.actions.interval.CCTintBy;
import org.cocos2d.actions.interval.CCTintTo;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;
import org.cocos2d.types.ccColor3B;

/**
 * Created by jimpai on 15/4/24.
 */
public class GameLayer extends CCLayer {

    CCSprite player;

    public GameLayer() {
        player = CCSprite.sprite("player.png");
        CGPoint cgPoint = CGPoint.ccp(100, 300);
        player.setPosition(cgPoint);
        this.addChild(player);

        CGPoint targetPoint = CGPoint.ccp(400, 300);
        CCMoveTo moveTo1 = CCMoveTo.action(2, targetPoint);
        CCMoveTo moveTo2 = CCMoveTo.action(2, cgPoint);
        CCSequence ccSequence = CCSequence.actions(moveTo1, moveTo2);

        CCRepeatForever ccRepeatForever = CCRepeatForever.action(ccSequence);
        player.runAction(ccRepeatForever);
        /*
        // CCRepeat 用於指定動作重覆的次數
        CCRepeat ccRepeat = CCRepeat.action(ccSequence, 3);
        player.runAction(ccRepeat);
        */
        /*
        ccColor3B color3b = ccColor3B.ccc3(-120, -255, -120);
        CCTintBy ccTintBy = CCTintBy.action(3, color3b);
        player.runAction(ccTintBy);
        */
        /*
        ccColor3B color3b = ccColor3B.ccc3(0, 0, 255);
        CCTintTo ccTintTo = CCTintTo.action(3, color3b);
        player.runAction(ccTintTo);
        */
        // CCFadeIn 動畫，作用是使精靈淡入
        /*
        CCFadeIn ccFadeIn = CCFadeIn.action(3);
        player.runAction(ccFadeIn);
        */
        /*
        // CCFadeOut 動畫，作用是使精靈淡出
        CCFadeOut ccFadeOut = CCFadeOut.action(3);
        player.runAction(ccFadeOut);
        */
    }
}
