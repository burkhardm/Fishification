/*
 * FoodboxEntity.java
 *
 * Copyright (c) 2013 Martin Burkhard and Sonja Maier.
 * CSCM Cooperation Systems Center Munich, Institute for Software Technology.
 * Bundeswehr University Munich. All rights reserved.
 *
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at <http://www.eclipse.org/legal/epl-v10.html>.
 *
 * The accompanying materials are made available under the terms
 * of Creative Commons Attribution-ShareAlike 3.0 Unported License.
 * You should have received a copy of the license along with this
 * work.  If not, see <http://creativecommons.org/licenses/by-sa/3.0/>.
 *
 *  Project: FishificationFX
 *   Author: Martin Burkhard
 *     Date: 9/2/13 12:48 AM
 */

package de.unibw.inf2.fishification.entities;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.sociotech.unui.javafx.engine2d.AbstractWorld;
import org.sociotech.unui.javafx.engine2d.entities.StaticEntity;

public class FoodboxEntity extends StaticEntity {

    private ImageView m_imageView;

    public FoodboxEntity() {

    }

    @Override
    protected void onInit(AbstractWorld world) {
        Image foodBoxImage = world.getImageResourceManager().get("foodbox.png");
        m_imageView = new ImageView(foodBoxImage);
        m_imageView.setTranslateX(world.getWidth() - foodBoxImage.getWidth() - 5);
        m_imageView.setTranslateY(world.getHeight() - foodBoxImage.getHeight() / 1.5);
        addNode(m_imageView);
    }

    @Override
    protected void onHide() {
        removeNode(m_imageView);
    }

    @Override
    protected void onShow() {
        addNode(m_imageView);
    }
}
