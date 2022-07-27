package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(
  initialPosition: Point2D,
) :
  SpaceObject("Explosion", '#', initialPosition, Vector2D(0.0, 0.0), 4.0, 0.0) {
  var lifeTime: Int = 0
}
