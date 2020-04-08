package ch.wavein.leaflet

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.|

@ScalaJSDefined
trait MapOptionsEditable extends MapOptions {
  val editable:js.UndefOr[Boolean] = js.undefined
}

@js.native
trait LeafletEditable extends Leaflet {
  def map(element: String | HTMLElement, options: MapOptionsEditable): MapEditable = js.native
}

@js.native
trait EditableMixin extends js.Any {
  def enableEdit():Unit = js.native
  def editEnabled():Boolean = js.native
  def disableEdit():Unit = js.native
  def toggleEdit():Unit = js.native
}

@js.native
trait EditTools extends js.Any {
  def drawing():Boolean = js.native
  def stopDrawing():Unit = js.native
  def commitDrawing():Unit = js.native
  def startPolyline(latlng: Leaflet.LatLngExpression, options:js.Any = ???):Polyline[_,_] = js.native
  def startPolygon(latlng: Leaflet.LatLngExpression, options:js.Any = ???):Polygon[_] = js.native
  def startMarker(latlng: Leaflet.LatLngExpression, options:js.Any = ???):Marker[_] = js.native
  def startRectangle(latlng: Leaflet.LatLngExpression, options:js.Any = ???):Rectangle[_] = js.native
  def startCircle(latlng: Leaflet.LatLngExpression, options:js.Any = ???):Circle[_] = js.native
}

@js.native
trait MapEditable extends Map {
  val editTools:EditTools = js.native
}

object LeafletEditable {


  implicit def editable(l:Leaflet):LeafletEditable = l.asInstanceOf[LeafletEditable]
  implicit def editPolyLine[T <: geojson.GeoJson.GeometryObject,P](pl:Polyline[T,P]) = pl.asInstanceOf[EditableMixin]
  implicit def editPolygon[P](pl:Polygon[P]) = pl.asInstanceOf[EditableMixin]
  implicit def editCircle[P](pl:Circle[P]) = pl.asInstanceOf[EditableMixin]
  implicit def editRectangle[P](pl:Rectangle[P]) = pl.asInstanceOf[EditableMixin]
  implicit def editMarker[P](pl:Marker[P]) = pl.asInstanceOf[EditableMixin]

}