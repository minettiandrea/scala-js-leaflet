package ch.wavein.leaflet.geojson


import ch.wavein.leaflet.geojson.GeoJson.{BBox, Geometry, Position}

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait GeoJsonObject extends js.Object {
  var `type`: String = js.native
  var bbox: BBox = js.native
}

@js.native
trait Point extends GeoJsonObject {
  var coordinates: Position = js.native
}

@js.native
trait MultiPoint extends GeoJsonObject {
  var coordinates: js.Array[Position] = js.native
}

@js.native
trait LineString extends GeoJsonObject {
  var coordinates: js.Array[Position] = js.native
}

@js.native
trait MultiLineString extends GeoJsonObject {
  var coordinates: js.Array[js.Array[Position]] = js.native
}

@js.native
trait Polygon extends GeoJsonObject {
  var coordinates: js.Array[js.Array[Position]] = js.native
}

@js.native
trait MultiPolygon extends GeoJsonObject {
  var coordinates: js.Array[js.Array[js.Array[Position]]] = js.native
}

@js.native
trait GeometryCollection extends GeoJsonObject {
  var geometries: js.Array[Geometry] = js.native
}

@js.native
trait Feature[G <: Geometry, P] extends GeoJsonObject {
  var geometry: G = js.native
  var id: String | Double = js.native
  var properties: P = js.native
}

@js.native
trait FeatureCollection[G <: Geometry, P] extends GeoJsonObject {
  var features: js.Array[Feature[G, P]] = js.native
}

@js.native
@JSGlobalScope
object GeoJson extends js.Object {
  type GeoJsonGeometryTypes = js.Array[String]
  type BBox = js.Tuple4[Double, Double, Double, Double] | js.Tuple6[Double, Double, Double, Double, Double, Double]
  type Position = js.Array[Double]
  type GeoJSON = Geometry | Feature[_,_] | FeatureCollection[_,_]
  type Geometry = Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection
  type GeometryObject = Geometry
  type GeoJsonProperties = js.Dictionary[js.Any]
}


