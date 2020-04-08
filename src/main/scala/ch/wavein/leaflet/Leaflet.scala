package ch.wavein.leaflet


import org.scalajs.dom.raw._

import scala.scalajs.js
import js.annotation._
import js.|




@js.native
@JSGlobal
class Transformation protected () extends js.Object {
  def this(a: Double, b: Double, c: Double, d: Double) = this()
  def transform(point: Point, scale: Double = ???): Point = js.native
  def untransform(point: Point, scale: Double = ???): Point = js.native
}


@js.native
@JSGlobal("LineUtil")
object LineUtil extends js.Object {
  def simplify(points: js.Array[Point], tolerance: Double): js.Array[Point] = js.native
  def pointToSegmentDistance(p: Point, p1: Point, p2: Point): Double = js.native
  def closestPointOnSegment(p: Point, p1: Point, p2: Point): Point = js.native
  def isFlat(latlngs: js.Array[Leaflet.LatLngExpression]): Boolean = js.native
}




@js.native
@JSGlobal("PolyUtil")
object PolyUtil extends js.Object {
  def clipPolygon(points: js.Array[Point], bounds: Leaflet.BoundsExpression, round: Boolean = ???): js.Array[Point] = js.native
}



@js.native
@JSGlobal("DomUtil")
object DomUtil extends js.Object {
  def get(element: String | HTMLElement): HTMLElement | Null = js.native
  def getStyle(el: HTMLElement, styleAttrib: String): String | Null = js.native
  def create(tagName: String, className: String = ???, container: HTMLElement = ???): HTMLElement = js.native
  def remove(el: HTMLElement): Unit = js.native
  def empty(el: HTMLElement): Unit = js.native
  def toFront(el: HTMLElement): Unit = js.native
  def toBack(el: HTMLElement): Unit = js.native
  def hasClass(el: HTMLElement, name: String): Boolean = js.native
  def addClass(el: HTMLElement, name: String): Unit = js.native
  def removeClass(el: HTMLElement, name: String): Unit = js.native
  def setClass(el: HTMLElement, name: String): Unit = js.native
  def getClass(el: HTMLElement): String = js.native
  def setOpacity(el: HTMLElement, opacity: Double): Unit = js.native
  def testProp(props: js.Array[String]): String | Boolean = js.native
  def setTransform(el: HTMLElement, offset: Point, scale: Double = ???): Unit = js.native
  def setPosition(el: HTMLElement, position: Point): Unit = js.native
  def getPosition(el: HTMLElement): Point = js.native
  def disableTextSelection(): Unit = js.native
  def enableTextSelection(): Unit = js.native
  def disableImageDrag(): Unit = js.native
  def enableImageDrag(): Unit = js.native
  def preventOutline(el: HTMLElement): Unit = js.native
  def restoreOutline(): Unit = js.native
  def TRANSFORM: String = js.native
  def TRANSITION: String = js.native
  def TRANSITION_END: String = js.native
}



@js.native
trait CRS extends js.Object {
  def latLngToPoint(latlng: Leaflet.LatLngExpression, zoom: Double): Point = js.native
  def pointToLatLng(point: Leaflet.PointExpression, zoom: Double): LatLng = js.native
  def project(latlng: LatLng | LatLngLiteral): Point = js.native
  def unproject(point: Leaflet.PointExpression): LatLng = js.native
  def scale(zoom: Double): Double = js.native
  def zoom(scale: Double): Double = js.native
  def getProjectedBounds(zoom: Double): Bounds = js.native
  def distance(latlng1: Leaflet.LatLngExpression, latlng2: Leaflet.LatLngExpression): Double = js.native
  def wrapLatLng(latlng: LatLng | LatLngLiteral): LatLng = js.native
  var code: String = js.native
  var wrapLng: js.Tuple2[Double, Double] = js.native
  var wrapLat: js.Tuple2[Double, Double] = js.native
  var infinite: Boolean = js.native
}


@js.native
@JSGlobal("CRS")
object CRS extends js.Object {
  val EPSG3395: CRS = js.native
  val EPSG3857: CRS = js.native
  val EPSG4326: CRS = js.native
  val Earth: CRS = js.native
  val Simple: CRS = js.native
}



@js.native
trait Projection extends js.Object {
  def project(latlng: LatLng | LatLngLiteral): Point = js.native
  def unproject(point: Leaflet.PointExpression): LatLng = js.native
  var bounds: Bounds = js.native
}


@js.native
@JSGlobal("Projection")
object Projection extends js.Object {
  val LonLat: Projection = js.native
  val Mercator: Projection = js.native
  val SphericalMercator: Projection = js.native
}



@js.native
trait LatLng extends js.Object {
  def equals(otherLatLng: Leaflet.LatLngExpression, maxMargin: Double = ???): Boolean = js.native
  override def toString(): String = js.native
  def distanceTo(otherLatLng: Leaflet.LatLngExpression): Double = js.native
  def wrap(): LatLng = js.native
  def toBounds(sizeInMeters: Double): LatLngBounds = js.native
  var lat: Double = js.native
  var lng: Double = js.native
  var alt: Double = js.native
}

@js.native
@JSGlobal("L.latLng")
object LatLng extends js.Any {
  def apply(latitude: Double, longitude: Double, altitude: Double = ???):LatLng = js.native
}

@js.native
trait LatLngLiteral extends js.Object {
  var lat: Double = js.native
  var lng: Double = js.native
}

@js.native
@JSGlobal
class LatLngBounds protected () extends js.Object {
  def this(southWest: Leaflet.LatLngExpression, northEast: Leaflet.LatLngExpression) = this()
  def this(latlngs: Leaflet.LatLngBoundsLiteral) = this()
  def extend(latlngOrBounds: Leaflet.LatLngExpression | Leaflet.LatLngBoundsExpression): this.type = js.native
  def pad(bufferRatio: Double): LatLngBounds = js.native
  def getCenter(): LatLng = js.native
  def getSouthWest(): LatLng = js.native
  def getNorthEast(): LatLng = js.native
  def getNorthWest(): LatLng = js.native
  def getSouthEast(): LatLng = js.native
  def getWest(): Double = js.native
  def getSouth(): Double = js.native
  def getEast(): Double = js.native
  def getNorth(): Double = js.native
  def contains(otherBoundsOrLatLng: Leaflet.LatLngBoundsExpression | Leaflet.LatLngExpression): Boolean = js.native
  def intersects(otherBounds: Leaflet.LatLngBoundsExpression): Boolean = js.native
  def overlaps(otherBounds: Leaflet.BoundsExpression): Boolean = js.native
  def toBBoxString(): String = js.native
  def equals(otherBounds: Leaflet.LatLngBoundsExpression): Boolean = js.native
  def isValid(): Boolean = js.native
}

@js.native
@JSGlobal
class Point protected () extends js.Object {
  def this(x: Double, y: Double, round: Boolean = ???) = this()
  override def clone(): Point = js.native
  def add(otherPoint: Leaflet.PointExpression): Point = js.native
  def subtract(otherPoint: Leaflet.PointExpression): Point = js.native
  def divideBy(num: Double): Point = js.native
  def multiplyBy(num: Double): Point = js.native
  def scaleBy(scale: Leaflet.PointExpression): Point = js.native
  def unscaleBy(scale: Leaflet.PointExpression): Point = js.native
  def round(): Point = js.native
  def floor(): Point = js.native
  def ceil(): Point = js.native
  def distanceTo(otherPoint: Leaflet.PointExpression): Double = js.native
  def equals(otherPoint: Leaflet.PointExpression): Boolean = js.native
  def contains(otherPoint: Leaflet.PointExpression): Boolean = js.native
  override def toString(): String = js.native
  var x: Double = js.native
  var y: Double = js.native
}

@js.native
trait Coords extends Point {
  var z: Double = js.native
}

@js.native
@JSGlobal
class Bounds protected () extends js.Object {
  def this(topLeft: Leaflet.PointExpression, bottomRight: Leaflet.PointExpression) = this()
  def this(points: js.Array[Point] | Leaflet.BoundsLiteral) = this()
  def extend(point: Leaflet.PointExpression): this.type = js.native
  def getCenter(round: Boolean = ???): Point = js.native
  def getBottomLeft(): Point = js.native
  def getTopRight(): Point = js.native
  def getSize(): Point = js.native
  def contains(pointOrBounds: Leaflet.BoundsExpression | Leaflet.PointExpression): Boolean = js.native
  def intersects(otherBounds: Leaflet.BoundsExpression): Boolean = js.native
  def overlaps(otherBounds: Leaflet.BoundsExpression): Boolean = js.native
  var min: Point = js.native
  var max: Point = js.native
}

@js.native
trait LeafletEventHandlerFnMap extends js.Object {
  @JSBracketAccess
  def apply(`type`: String): Leaflet.LeafletEventHandlerFn = js.native
  @JSBracketAccess
  def update(`type`: String, v: Leaflet.LeafletEventHandlerFn): Unit = js.native
}

@js.native
@JSGlobal
abstract class Evented extends js.Any  {
  def on(`type`: String, fn: Leaflet.LeafletEventHandlerFn, context: js.Any = ???): this.type = js.native
  def on(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  def off(`type`: String, fn: Leaflet.LeafletEventHandlerFn = ???, context: js.Any = ???): this.type = js.native
  def off(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  def off(): this.type = js.native
  def fire(`type`: String, data: js.Any = ???, propagate: Boolean = ???): this.type = js.native
  def listens(`type`: String): Boolean = js.native
  def once(`type`: String, fn: Leaflet.LeafletEventHandlerFn, context: js.Any = ???): this.type = js.native
  def once(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  def addEventParent(obj: Evented): this.type = js.native
  def removeEventParent(obj: Evented): this.type = js.native
  def addEventListener(`type`: String, fn: Leaflet.LeafletEventHandlerFn, context: js.Any = ???): this.type = js.native
  def addEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  def removeEventListener(`type`: String, fn: Leaflet.LeafletEventHandlerFn = ???, context: js.Any = ???): this.type = js.native
  def removeEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  def clearAllEventListeners(): this.type = js.native
  def addOneTimeEventListener(`type`: String, fn: Leaflet.LeafletEventHandlerFn, context: js.Any = ???): this.type = js.native
  def addOneTimeEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  def fireEvent(`type`: String, data: js.Any = ???, propagate: Boolean = ???): this.type = js.native
  def hasEventListeners(`type`: String): Boolean = js.native
}

@js.native
@JSGlobal
class Draggable protected () extends Evented {
  def this(element: HTMLElement, dragStartTarget: HTMLElement = ???, preventOutline: Boolean = ???) = this()
  def enable(): Unit = js.native
  def disable(): Unit = js.native
  def finishDrag(): Unit = js.native
}

@ScalaJSDefined
trait LayerOptions extends js.Object {
  val pane: js.UndefOr[String] = js.undefined
  val attribution: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait InteractiveLayerOptions extends LayerOptions {
  val interactive: js.UndefOr[Boolean] = js.undefined
  val bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined
}

@js.native
@JSGlobal
class Layer protected () extends Evented {
  def this(options: LayerOptions = ???) = this()
  def addTo(map: Map | LayerGroup[_]): this.type = js.native
  def remove(): this.type = js.native
  def removeFrom(map: Map): this.type = js.native
  def getPane(name: String = ???): HTMLElement | Unit = js.native
  def bindPopup(content: js.Function1[Layer, Leaflet.Content] | Leaflet.Content | Popup, options: PopupOptions = ???): this.type = js.native
  def unbindPopup(): this.type = js.native
  def openPopup(latlng: Leaflet.LatLngExpression = ???): this.type = js.native
  def closePopup(): this.type = js.native
  def togglePopup(): this.type = js.native
  def isPopupOpen(): Boolean = js.native
  def setPopupContent(content: Leaflet.Content | Popup): this.type = js.native
  def getPopup(): Popup | Unit = js.native
  def bindTooltip(content: js.Function1[Layer, Leaflet.Content] | Tooltip | Leaflet.Content, options: TooltipOptions = ???): this.type = js.native
  def unbindTooltip(): this.type = js.native
  def openTooltip(latlng: Leaflet.LatLngExpression = ???): this.type = js.native
  def closeTooltip(): this.type = js.native
  def toggleTooltip(): this.type = js.native
  def isTooltipOpen(): Boolean = js.native
  def setTooltipContent(content: Leaflet.Content | Tooltip): this.type = js.native
  def getTooltip(): Tooltip | Unit = js.native
  def onAdd(map: Map): this.type = js.native
  def onRemove(map: Map): this.type = js.native
  def getEvents(): js.Dictionary[js.Function1[LeafletEvent, Unit]] = js.native
  def getAttribution(): String | Null = js.native
  def beforeAdd(map: Map): this.type = js.native
  protected var _map: Map = js.native
}

@ScalaJSDefined
trait GridLayerOptions extends js.Object {
  val tileSize: js.UndefOr[Double | Point] = js.undefined
  val opacity: js.UndefOr[Double] = js.undefined
  val updateWhenIdle: js.UndefOr[Boolean] = js.undefined
  val updateWhenZooming: js.UndefOr[Boolean] = js.undefined
  val updateInterval: js.UndefOr[Double] = js.undefined
  val attribution: js.UndefOr[String] = js.undefined
  val zIndex: js.UndefOr[Double] = js.undefined
  val bounds: js.UndefOr[Leaflet.LatLngBoundsExpression] = js.undefined
  val minZoom: js.UndefOr[Double] = js.undefined
  val maxZoom: js.UndefOr[Double] = js.undefined
  val noWrap: js.UndefOr[Boolean] = js.undefined
  val pane: js.UndefOr[String] = js.undefined
  val className: js.UndefOr[String] = js.undefined
  val keepBuffer: js.UndefOr[Double] = js.undefined
  val id:js.UndefOr[String] = js.undefined
}

@js.native
trait InternalTiles extends js.Object {
  @JSBracketAccess
  def apply(key: String): js.Any = js.native
  @JSBracketAccess
  def update(key: String, v: js.Any): Unit = js.native
}

@js.native
@JSGlobal
class GridLayer protected () extends Layer {
  def this(options: GridLayerOptions = ???) = this()
  def bringToFront(): this.type = js.native
  def bringToBack(): this.type = js.native
  def getContainer(): HTMLElement | Null = js.native
  def setOpacity(opacity: Double): this.type = js.native
  def setZIndex(zIndex: Double): this.type = js.native
  def isLoading(): Boolean = js.native
  def redraw(): this.type = js.native
  def getTileSize(): Point = js.native
  def createTile(coords: Coords, done: Leaflet.DoneCallback): HTMLElement = js.native
  def _tileCoordsToKey(coords: Coords): String = js.native
  protected var _tiles: InternalTiles = js.native
  protected var _tileZoom: Double = js.native
}

@ScalaJSDefined
trait TileLayerOptions extends GridLayerOptions {
  val maxNativeZoom: js.UndefOr[Double] = js.undefined
  val minNativeZoom: js.UndefOr[Double] = js.undefined
  val subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  val errorTileUrl: js.UndefOr[String] = js.undefined
  val zoomOffset: js.UndefOr[Double] = js.undefined
  val tms: js.UndefOr[Boolean] = js.undefined
  val zoomReverse: js.UndefOr[Boolean]= js.undefined
  val detectRetina: js.UndefOr[Boolean] = js.undefined
  val crossOrigin: js.UndefOr[Leaflet.CrossOrigin]= js.undefined
}


@js.native
@JSGlobal
class TileLayer protected () extends GridLayer {
  def this(urlTemplate: String, options: TileLayerOptions = ???) = this()
  def setUrl(url: String, noRedraw: Boolean = ???): this.type = js.native
  def _abortLoading(): Unit = js.native
  def _getZoomForUrl(): Double = js.native
  var options: TileLayerOptions = js.native
}


@js.native
@JSGlobal("TileLayer.WMS")
class WMS protected () extends TileLayer {
  def this(baseUrl: String, options: WMSOptions) = this()
  def setParams(params: WMSParams, noRedraw: Boolean = ???): this.type = js.native
  var wmsParams: WMSParams = js.native
}


@ScalaJSDefined
trait WMSOptions extends TileLayerOptions {
  var layers: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var crs: js.UndefOr[CRS] = js.undefined
  var uppercase: js.UndefOr[Boolean] = js.undefined
}

@js.native
trait WMSParams extends js.Object {
  var format: String = js.native
  var layers: String = js.native
  var request: String = js.native
  var service: String = js.native
  var styles: String = js.native
  var version: String = js.native
  var transparent: Boolean = js.native
  var width: Double = js.native
  var height: Double = js.native
}


@js.native
@JSGlobal("tileLayer")
object TileLayer extends js.Object {
  def wms(baseUrl: String, options: WMSOptions = ???): WMS = js.native
}



@js.native
trait ImageOverlayOptions extends InteractiveLayerOptions {
  var opacity: Double = js.native
  var alt: String = js.native
  var crossOrigin: Leaflet.CrossOrigin = js.native
  var errorOverlayUrl: String = js.native
  var zIndex: Double = js.native
  var className: String = js.native
}

@js.native
@JSGlobal
class ImageOverlay protected () extends Layer {
  def this(imageUrl: String, bounds: Leaflet.LatLngBoundsExpression, options: ImageOverlayOptions = ???) = this()
  def setOpacity(opacity: Double): this.type = js.native
  def bringToFront(): this.type = js.native
  def bringToBack(): this.type = js.native
  def setUrl(url: String): this.type = js.native
  def setBounds(bounds: LatLngBounds): this.type = js.native
  def setZIndex(value: Double): this.type = js.native
  def getBounds(): LatLngBounds = js.native
  def getElement(): HTMLImageElement | Unit = js.native
  var options: ImageOverlayOptions = js.native
}

@js.native
trait VideoOverlayOptions extends ImageOverlayOptions {
  var autoplay: Boolean = js.native
  var loop: Boolean = js.native
}

@js.native
@JSGlobal
class VideoOverlay protected () extends Layer {
  def this(video: String | js.Array[String] | HTMLVideoElement, bounds: Leaflet.LatLngBoundsExpression, options: VideoOverlayOptions = ???) = this()
  def setOpacity(opacity: Double): this.type = js.native
  def bringToFront(): this.type = js.native
  def bringToBack(): this.type = js.native
  def setUrl(url: String): this.type = js.native
  def setBounds(bounds: LatLngBounds): this.type = js.native
  def getBounds(): LatLngBounds = js.native
  def getElement(): HTMLVideoElement | Unit = js.native
  var options: VideoOverlayOptions = js.native
}

@js.native
trait PathOptions extends InteractiveLayerOptions {
  var stroke: Boolean = js.native
  var color: String = js.native
  var weight: Double = js.native
  var opacity: Double = js.native
  var lineCap: Leaflet.LineCapShape = js.native
  var lineJoin: Leaflet.LineJoinShape = js.native
  var dashArray: String | js.Array[Double] = js.native
  var dashOffset: String = js.native
  var fill: Boolean = js.native
  var fillColor: String = js.native
  var fillOpacity: Double = js.native
  var fillRule: Leaflet.FillRule = js.native
  var renderer: Renderer = js.native
  var className: String = js.native
}

@js.native
@JSGlobal
abstract class Path extends Layer {
  def redraw(): this.type = js.native
  def setStyle(style: PathOptions): this.type = js.native
  def bringToFront(): this.type = js.native
  def bringToBack(): this.type = js.native
  def getElement(): Element | Unit = js.native
}

@js.native
trait PolylineOptions extends PathOptions {
  var smoothFactor: Double = js.native
  var noClip: Boolean = js.native
}

@js.native
@JSGlobal
class Polyline[T <: geojson.GeoJson.GeometryObject, P] protected () extends Path {
  def this(latlngs: js.Array[Leaflet.LatLngExpression] | js.Array[js.Array[Leaflet.LatLngExpression]], options: PolylineOptions = ???) = this()
  def toGeoJSON(): geojson.Feature[T, P] = js.native
  def getLatLngs(): js.Array[LatLng] | js.Array[js.Array[LatLng]] | js.Array[js.Array[js.Array[LatLng]]] = js.native
  def setLatLngs(latlngs: js.Array[Leaflet.LatLngExpression] | js.Array[js.Array[Leaflet.LatLngExpression]] | js.Array[js.Array[js.Array[Leaflet.LatLngExpression]]]): this.type = js.native
  def isEmpty(): Boolean = js.native
  def getCenter(): LatLng = js.native
  def getBounds(): LatLngBounds = js.native
  def addLatLng(latlng: Leaflet.LatLngExpression | js.Array[Leaflet.LatLngExpression]): this.type = js.native
  var feature: geojson.Feature[T, P] = js.native
  var options: PolylineOptions = js.native
}

@js.native
@JSGlobal
class Polygon[P] protected () extends Polyline[geojson.GeoJson.GeometryObject, P] {
  def this(latlngs: js.Array[Leaflet.LatLngExpression] | js.Array[js.Array[Leaflet.LatLngExpression]] | js.Array[js.Array[js.Array[Leaflet.LatLngExpression]]], options: PolylineOptions = ???) = this()
}

@js.native
@JSGlobal
class Rectangle[P] protected () extends Polygon[P] {
  def this(latLngBounds: Leaflet.LatLngBoundsExpression, options: PolylineOptions = ???) = this()
  def setBounds(latLngBounds: Leaflet.LatLngBoundsExpression): this.type = js.native
}

@js.native
trait CircleMarkerOptions extends PathOptions {
  var radius: Double = js.native
}

@js.native
@JSGlobal
class CircleMarker[P] protected () extends Path {
  def this(latlng: Leaflet.LatLngExpression, options: CircleMarkerOptions = ???) = this()
  def toGeoJSON(): geojson.Feature[geojson.GeoJson.Geometry, P] = js.native
  def setLatLng(latLng: Leaflet.LatLngExpression): this.type = js.native
  def getLatLng(): LatLng = js.native
  def setRadius(radius: Double): this.type = js.native
  def getRadius(): Double = js.native
  var options: CircleMarkerOptions = js.native
  var feature: geojson.Feature[geojson.GeoJson.Geometry, P] = js.native
}

@js.native
@JSGlobal
class Circle[P] protected () extends CircleMarker[P] {
  def this(latlng: Leaflet.LatLngExpression, options: CircleMarkerOptions) = this()
  def this(latlng: Leaflet.LatLngExpression, radius: Double, options: CircleMarkerOptions) = this()
  def getBounds(): LatLngBounds = js.native
}

@js.native
trait RendererOptions extends LayerOptions {
  var padding: Double = js.native
}

@js.native
@JSGlobal
class Renderer protected () extends Layer {
  def this(options: RendererOptions = ???) = this()
  var options: RendererOptions = js.native
}

@js.native
@JSGlobal
class SVG extends Renderer {
}


@js.native
@JSGlobal("SVG")
object SVG extends js.Object {
  def create(name: String): SVGElement = js.native
  def pointsToPath(rings: js.Array[Leaflet.PointExpression], close: Boolean): String = js.native
}



@js.native
@JSGlobal
class Canvas extends Renderer {
}

@js.native
@JSGlobal
class LayerGroup[P] protected () extends Layer {
  def this(layers: js.Array[Layer] = ???, options: LayerOptions = ???) = this()
  def toGeoJSON(): geojson.FeatureCollection[geojson.GeoJson.GeometryObject, P] | geojson.Feature[geojson.GeoJson.Geometry, P] | geojson.GeometryCollection = js.native
  def addLayer(layer: Layer): this.type = js.native
  def removeLayer(layer: Double | Layer): this.type = js.native
  def hasLayer(layer: Layer): Boolean = js.native
  def clearLayers(): this.type = js.native
  def invoke(methodName: String, params: js.Any*): this.type = js.native
  def eachLayer(fn: js.Function1[Layer, Unit], context: js.Any = ???): this.type = js.native
  def getLayer(id: Double): Layer | Unit = js.native
  def getLayers(): js.Array[Layer] = js.native
  def setZIndex(zIndex: Double): this.type = js.native
  def getLayerId(layer: Layer): Double = js.native
  var feature: geojson.FeatureCollection[geojson.GeoJson.GeometryObject, P] | geojson.Feature[geojson.GeoJson.Geometry, P] | geojson.GeometryCollection = js.native
}

@js.native
@JSGlobal
class FeatureGroup[P] extends LayerGroup[P] {
  def setStyle(style: PathOptions): this.type = js.native
  def bringToFront(): this.type = js.native
  def bringToBack(): this.type = js.native
  def getBounds(): LatLngBounds = js.native
}

@ScalaJSDefined
trait GeoJSONOptions[P] extends LayerOptions {
  val pointToLayer: js.UndefOr[js.Function2[geojson.Feature[geojson.GeoJson.Geometry, P],LatLng,Layer]] = js.undefined
  var style: js.UndefOr[PathOptions | Leaflet.StyleFunction[P]] = js.undefined
  val onEachFeature: js.UndefOr[js.Function2[geojson.Feature[geojson.GeoJson.Geometry, P],Layer,Unit]] = js.undefined
  val filter: js.UndefOr[js.Function1[geojson.Feature[geojson.GeoJson.GeometryObject, P],Boolean]] = js.undefined
  val coordsToLatLng:js.UndefOr[js.Function1[js.Tuple2[Double, Double] | js.Tuple3[Double, Double, Double],LatLng]] = js.undefined
}

@js.native
@JSGlobal
class GeoJSON[P] protected () extends FeatureGroup[P] {
  def this(gj: geojson.GeoJsonObject = ???, options: GeoJSONOptions[P] = ???) = this()
  def addData(data: geojson.GeoJsonObject): Layer = js.native
  def resetStyle(layer: Layer): Layer = js.native
  def setStyle(style: PathOptions | Leaflet.StyleFunction[P]): this.type = js.native
  var options: GeoJSONOptions[P] = js.native
}

@js.native
@JSGlobal
object GeoJSON extends js.Object {
  def geometryToLayer[P](featureData: geojson.Feature[geojson.GeoJson.GeometryObject, P], options: GeoJSONOptions[P] = ???): Layer = js.native
  def coordsToLatLng(coords: js.Tuple2[Double, Double] | js.Tuple3[Double, Double, Double]): LatLng = js.native
  def coordsToLatLngs(coords: js.Array[js.Any], levelsDeep: Double = ???, coordsToLatLng: js.Function1[js.Tuple2[Double, Double] | js.Tuple3[Double, Double, Double], LatLng] = ???): js.Array[js.Any] = js.native
  def latLngToCoords(latlng: LatLng): js.Tuple2[Double, Double] | js.Tuple3[Double, Double, Double] = js.native
  def latLngsToCoords(latlngs: js.Array[js.Any], levelsDeep: Double = ???, closed: Boolean = ???): js.Array[js.Any] = js.native
  def asFeature[P](_geojson: geojson.Feature[geojson.GeoJson.GeometryObject, P] | geojson.GeoJson.GeometryObject): geojson.Feature[geojson.GeoJson.GeometryObject, P] = js.native
}

@ScalaJSDefined
trait MapOptions extends js.Object {
  var preferCanvas: js.UndefOr[Boolean] = js.undefined
  var attributionControl: js.UndefOr[Boolean] = js.undefined
  var zoomControl: js.UndefOr[Boolean] = js.undefined
  var closePopupOnClick: js.UndefOr[Boolean] = js.undefined
  var zoomSnap: js.UndefOr[Double] = js.undefined
  var zoomDelta: js.UndefOr[Double] = js.undefined
  var trackResize: js.UndefOr[Boolean] = js.undefined
  var boxZoom: js.UndefOr[Boolean] = js.undefined
  var doubleClickZoom: js.UndefOr[Zoom] = js.undefined
  var dragging: js.UndefOr[Boolean] = js.undefined
  var crs: js.UndefOr[CRS] = js.undefined
  var center: js.UndefOr[Leaflet.LatLngExpression] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  var maxBounds: js.UndefOr[Leaflet.LatLngBoundsExpression] = js.undefined
  var renderer: js.UndefOr[Renderer] = js.undefined
  var fadeAnimation: js.UndefOr[Boolean] = js.undefined
  var markerZoomAnimation: js.UndefOr[Boolean] = js.undefined
  var transform3DLimit: js.UndefOr[Double] = js.undefined
  var zoomAnimation: js.UndefOr[Boolean] = js.undefined
  var zoomAnimationThreshold: js.UndefOr[Double] = js.undefined
  var inertia: js.UndefOr[Boolean] = js.undefined
  var inertiaDeceleration: js.UndefOr[Double] = js.undefined
  var inertiaMaxSpeed: js.UndefOr[Double] = js.undefined
  var easeLinearity: js.UndefOr[Double] = js.undefined
  var worldCopyJump: js.UndefOr[Boolean] = js.undefined
  var maxBoundsViscosity: js.UndefOr[Double] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var keyboardPanDelta: js.UndefOr[Double] = js.undefined
  var scrollWheelZoom: js.UndefOr[Zoom] = js.undefined
  var wheelDebounceTime: js.UndefOr[Double] = js.undefined
  var wheelPxPerZoomLevel: js.UndefOr[Double] = js.undefined
  var tap: js.UndefOr[Boolean] = js.undefined
  var tapTolerance: js.UndefOr[Double] = js.undefined
  var touchZoom: js.UndefOr[Zoom] = js.undefined
  var bounceAtZoomLimits: js.UndefOr[Boolean] = js.undefined
}

@js.native
trait ControlOptions extends js.Object {
  var position: Leaflet.ControlPosition = js.native
}

@js.native
@JSGlobal
class Control protected () extends js.Any {
  def this(options: ControlOptions = ???) = this()
  def getPosition(): Leaflet.ControlPosition = js.native
  def setPosition(position: Leaflet.ControlPosition): this.type = js.native
  def getContainer(): HTMLElement | Unit = js.native
  def addTo(map: Map): this.type = js.native
  def remove(): this.type = js.native
  def onAdd(map: Map): HTMLElement = js.native
  def onRemove(map: Map): Unit = js.native
}


@js.native
trait ZoomOptions extends ControlOptions {
  var zoomInText: String = js.native
  var zoomInTitle: String = js.native
  var zoomOutText: String = js.native
  var zoomOutTitle: String = js.native
}

@js.native
@JSGlobal("Control.Zoom")
class Zoom protected () extends Control {
  def this(options: ZoomOptions = ???) = this()
  var options: ZoomOptions = js.native
}

@js.native
trait AttributionOptions extends ControlOptions {
  var prefix: String | Boolean = js.native
  var options: ControlOptions = js.native
}

@js.native
@JSGlobal("Control.Attribution")
class Attribution protected () extends Control {
  def this(options: AttributionOptions = ???) = this()
  def setPrefix(prefix: String): this.type = js.native
  def addAttribution(text: String): this.type = js.native
  def removeAttribution(text: String): this.type = js.native
  var options: AttributionOptions = js.native
}

@js.native
trait LayersOptions extends ControlOptions {
  var collapsed: Boolean = js.native
  var autoZIndex: Boolean = js.native
  var hideSingleBase: Boolean = js.native
  var options: ControlOptions = js.native
}

@js.native
trait LayersObject extends js.Object {
  @JSBracketAccess
  def apply(name: String): Layer = js.native
  @JSBracketAccess
  def update(name: String, v: Layer): Unit = js.native
}

@js.native
@JSGlobal("Control.Layers")
class Layers protected () extends Control {
  def this(baseLayers: LayersObject = ???, overlays: LayersObject = ???, options: LayersOptions = ???) = this()
  def addBaseLayer(layer: Layer, name: String): this.type = js.native
  def addOverlay(layer: Layer, name: String): this.type = js.native
  def removeLayer(layer: Layer): this.type = js.native
  def expand(): this.type = js.native
  def collapse(): this.type = js.native
  var options: LayersOptions = js.native
}

@js.native
trait ScaleOptions extends ControlOptions {
  var maxWidth: Double = js.native
  var metric: Boolean = js.native
  var imperial: Boolean = js.native
  var updateWhenIdle: Boolean = js.native
  var options: ControlOptions = js.native
}

@js.native
@JSGlobal("Control.Scale")
class Scale protected () extends Control {
  def this(options: ScaleOptions = ???) = this()
  var options: ScaleOptions = js.native
}



@js.native
@JSGlobal("control")
object Control extends js.Object {
  def zoom(options: ZoomOptions = ???): Zoom = js.native
  def attribution(options: AttributionOptions = ???): Attribution = js.native
  def layers(baseLayers: LayersObject = ???, overlays: LayersObject = ???, options: LayersOptions = ???): Layers = js.native
  def scale(options: ScaleOptions = ???): Scale = js.native
}



@js.native
trait DivOverlayOptions extends js.Object {
  var zoomAnimation: Boolean = js.native
  var className: String = js.native
  var pane: String = js.native
}

@js.native
trait PopupOptions extends DivOverlayOptions {
  var offset: Leaflet.PointExpression = js.native
  var maxWidth: Double = js.native
  var minWidth: Double = js.native
  var maxHeight: Double = js.native
  var keepInView: Boolean = js.native
  var closeButton: Boolean = js.native
  var autoPan: Boolean = js.native
  var autoPanPaddingTopLeft: Leaflet.PointExpression = js.native
  var autoPanPaddingBottomRight: Leaflet.PointExpression = js.native
  var autoPanPadding: Leaflet.PointExpression = js.native
  var autoClose: Boolean = js.native
  var closeOnClick: Boolean = js.native
  var closeOnEscapeKey: Boolean = js.native
}

@js.native
@JSGlobal
class Popup protected () extends Layer {
  def this(options: PopupOptions = ???, source: Layer = ???) = this()
  def getLatLng(): LatLng | Unit = js.native
  def setLatLng(latlng: Leaflet.LatLngExpression): this.type = js.native
  def getContent(): Leaflet.Content | js.Function1[Layer, Leaflet.Content] | Unit = js.native
  def setContent(htmlContent: js.Function1[Layer, Leaflet.Content] | Leaflet.Content): this.type = js.native
  def getElement(): HTMLElement | Unit = js.native
  def update(): Unit = js.native
  def isOpen(): Boolean = js.native
  def bringToFront(): this.type = js.native
  def bringToBack(): this.type = js.native
  def openOn(map: Map): this.type = js.native
  var options: PopupOptions = js.native
}

@js.native
trait TooltipOptions extends DivOverlayOptions {
  var offset: Leaflet.PointExpression = js.native
  var direction: Leaflet.Direction = js.native
  var permanent: Boolean = js.native
  var sticky: Boolean = js.native
  var interactive: Boolean = js.native
  var opacity: Double = js.native
}

@js.native
@JSGlobal
class Tooltip protected () extends Layer {
  def this(options: TooltipOptions = ???, source: Layer = ???) = this()
  def setOpacity(`val`: Double): Unit = js.native
  def getLatLng(): LatLng | Unit = js.native
  def setLatLng(latlng: Leaflet.LatLngExpression): this.type = js.native
  def getContent(): Leaflet.Content | Unit = js.native
  def setContent(htmlContent: js.Function1[Layer, Leaflet.Content] | Leaflet.Content): this.type = js.native
  def getElement(): HTMLElement | Unit = js.native
  def update(): Unit = js.native
  def isOpen(): Boolean = js.native
  def bringToFront(): this.type = js.native
  def bringToBack(): this.type = js.native
  var options: TooltipOptions = js.native
}



@js.native
trait PanOptions extends js.Object {
  var animate: Boolean = js.native
  var duration: Double = js.native
  var easeLinearity: Double = js.native
  var noMoveStart: Boolean = js.native
}

@js.native
trait ZoomPanOptions extends PanOptions {
}

@js.native
trait FitBoundsOptions extends  PanOptions {
  var paddingTopLeft: Leaflet.PointExpression = js.native
  var paddingBottomRight: Leaflet.PointExpression = js.native
  var padding: Leaflet.PointExpression = js.native
  var maxZoom: Double = js.native
}

@js.native
trait PanInsideOptions extends js.Object {
  var paddingTopLeft: Leaflet.PointExpression = js.native
  var paddingBottomRight: Leaflet.PointExpression = js.native
  var padding: Leaflet.PointExpression = js.native
}

@js.native
trait LocateOptions extends js.Object {
  var watch: Boolean = js.native
  var setView: Boolean = js.native
  var maxZoom: Double = js.native
  var timeout: Double = js.native
  var maximumAge: Double = js.native
  var enableHighAccuracy: Boolean = js.native
}

@js.native
@JSGlobal
class Handler protected () extends js.Any {
  def this(map: Map) = this()
  def enable(): this.type = js.native
  def disable(): this.type = js.native
  def enabled(): Boolean = js.native
  def addHooks(): Unit = js.native
  def removeHooks(): Unit = js.native
}

@js.native
trait LeafletEvent extends js.Object {
  var `type`: String = js.native
  var target: js.Any = js.native
}

@js.native
trait LeafletMouseEvent extends LeafletEvent {
  var latlng: LatLng = js.native
  var layerPoint: Point = js.native
  var containerPoint: Point = js.native
  var originalEvent: MouseEvent = js.native
}

@js.native
trait LeafletKeyboardEvent extends LeafletEvent {
  var originalEvent: KeyboardEvent = js.native
}

@js.native
trait LocationEvent extends LeafletEvent {
  var latlng: LatLng = js.native
  var bounds: LatLngBounds = js.native
  var accuracy: Double = js.native
  var altitude: Double = js.native
  var altitudeAccuracy: Double = js.native
  var heading: Double = js.native
  var speed: Double = js.native
  var timestamp: Double = js.native
}

@js.native
trait ErrorEvent extends LeafletEvent {
  var message: String = js.native
  var code: Double = js.native
}

@js.native
trait LayerEvent extends LeafletEvent {
  var layer: Layer = js.native
}

@js.native
trait LayersControlEvent extends LayerEvent {
  var name: String = js.native
}

@js.native
trait TileEvent extends LeafletEvent {
  var tile: HTMLImageElement = js.native
  var coords: Point = js.native
}

@js.native
trait TileErrorEvent extends TileEvent {
  var error: Error = js.native
}

@js.native
trait ResizeEvent extends LeafletEvent {
  var oldSize: Point = js.native
  var newSize: Point = js.native
}

@js.native
trait GeoJSONEvent extends LeafletEvent {
  var layer: Layer = js.native
  var properties: js.Any = js.native
  var geometryType: String = js.native
  var id: String = js.native
}

@js.native
trait PopupEvent extends LeafletEvent {
  var popup: Popup = js.native
}

@js.native
trait TooltipEvent extends LeafletEvent {
  var tooltip: Tooltip = js.native
}

@js.native
trait DragEndEvent extends LeafletEvent {
  var distance: Double = js.native
}

@js.native
trait ZoomAnimEvent extends LeafletEvent {
  var center: LatLng = js.native
  var zoom: Double = js.native
  var noUpdate: Boolean = js.native
}


@js.native
@JSGlobal("DomEvent")
object DomEvent extends js.Object {
  type EventHandlerFn = js.Function1[Event, Unit]
  def on(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): DomEvent.type = js.native
  def on(el: HTMLElement, eventMap: js.Dictionary[EventHandlerFn], context: js.Any): DomEvent.type = js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): DomEvent.type = js.native
  def off(el: HTMLElement, eventMap: js.Dictionary[EventHandlerFn], context: js.Any): DomEvent.type = js.native
  def stopPropagation(ev: Event): DomEvent.type = js.native
  def disableScrollPropagation(el: HTMLElement): DomEvent.type = js.native
  def disableClickPropagation(el: HTMLElement): DomEvent.type = js.native
  def preventDefault(ev: Event): DomEvent.type = js.native
  def stop(ev: Event): DomEvent.type = js.native
  def getMousePosition(ev: MouseEvent, container: HTMLElement = ???): Point = js.native
  def getWheelDelta(ev: Event): Double = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): DomEvent.type = js.native
  def addListener(el: HTMLElement, eventMap: js.Dictionary[EventHandlerFn], context: js.Any): DomEvent.type = js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): DomEvent.type = js.native
  def removeListener(el: HTMLElement, eventMap: js.Dictionary[EventHandlerFn], context: js.Any): DomEvent.type = js.native
}



@js.native
trait DefaultMapPanes extends js.Object {
  var mapPane: HTMLElement = js.native
  var tilePane: HTMLElement = js.native
  var overlayPane: HTMLElement = js.native
  var shadowPane: HTMLElement = js.native
  var markerPane: HTMLElement = js.native
  var tooltipPane: HTMLElement = js.native
  var popupPane: HTMLElement = js.native
}

@js.native
@JSGlobal
class Map protected () extends Evented {
  def this(element: String | HTMLElement, options: MapOptions = ???) = this()
  def getRenderer(layer: Path): Renderer = js.native
  def addControl(control: Control): this.type = js.native
  def removeControl(control: Control): this.type = js.native
  def addLayer(layer: Layer): this.type = js.native
  def removeLayer(layer: Layer): this.type = js.native
  def hasLayer(layer: Layer): Boolean = js.native
  def eachLayer(fn: js.Function1[Layer, Unit], context: js.Any = ???): this.type = js.native
  def openPopup(popup: Popup): this.type = js.native
  def openPopup(content: Leaflet.Content, latlng: Leaflet.LatLngExpression, options: PopupOptions = ???): this.type = js.native
  def closePopup(popup: Popup = ???): this.type = js.native
  def openTooltip(tooltip: Tooltip): this.type = js.native
  def openTooltip(content: Leaflet.Content, latlng: Leaflet.LatLngExpression, options: TooltipOptions = ???): this.type = js.native
  def closeTooltip(tooltip: Tooltip = ???): this.type = js.native
  def setView(center: Leaflet.LatLngExpression, zoom: Double, options: ZoomPanOptions = ???): this.type = js.native
  def setZoom(zoom: Double, options: ZoomPanOptions = ???): this.type = js.native
  def zoomIn(delta: Double = ???, options: ZoomOptions = ???): this.type = js.native
  def zoomOut(delta: Double = ???, options: ZoomOptions = ???): this.type = js.native
  def setZoomAround(position: Point | Leaflet.LatLngExpression, zoom: Double, options: ZoomOptions = ???): this.type = js.native
  def fitBounds(bounds: Leaflet.LatLngBoundsExpression, options: FitBoundsOptions = ???): this.type = js.native
  def fitWorld(options: FitBoundsOptions = ???): this.type = js.native
  def panTo(latlng: Leaflet.LatLngExpression, options: PanOptions = ???): this.type = js.native
  def panBy(offset: Leaflet.PointExpression): this.type = js.native
  def setMaxBounds(bounds: Leaflet.LatLngBoundsExpression): this.type = js.native
  def setMinZoom(zoom: Double): this.type = js.native
  def setMaxZoom(zoom: Double): this.type = js.native
  def panInside(latLng: Leaflet.LatLngExpression, options: PanInsideOptions = ???): this.type = js.native
  def panInsideBounds(bounds: Leaflet.LatLngBoundsExpression, options: PanOptions = ???): this.type = js.native
  def invalidateSize(options: Boolean | ZoomPanOptions = ???): this.type = js.native
  def stop(): this.type = js.native
  def flyTo(latlng: Leaflet.LatLngExpression, zoom: Double = ???, options: ZoomPanOptions = ???): this.type = js.native
  def flyToBounds(bounds: Leaflet.LatLngBoundsExpression, options: FitBoundsOptions = ???): this.type = js.native
  def addHandler(name: String, HandlerClass: Map => Handler ): this.type = js.native
  def remove(): this.type = js.native
  def createPane(name: String, container: HTMLElement = ???): HTMLElement = js.native
  def getPane(pane: String | HTMLElement): HTMLElement | Unit = js.native
  def getPanes(): js.Dictionary[HTMLElement] with DefaultMapPanes = js.native
  def getContainer(): HTMLElement = js.native
  def whenReady(fn: js.Function0[Unit], context: js.Any = ???): this.type = js.native
  def getCenter(): LatLng = js.native
  def getZoom(): Double = js.native
  def getBounds(): LatLngBounds = js.native
  def getMinZoom(): Double = js.native
  def getMaxZoom(): Double = js.native
  def getBoundsZoom(bounds: Leaflet.LatLngBoundsExpression, inside: Boolean = ???): Double = js.native
  def getSize(): Point = js.native
  def getPixelBounds(): Bounds = js.native
  def getPixelOrigin(): Point = js.native
  def getPixelWorldBounds(zoom: Double = ???): Bounds = js.native
  def getZoomScale(toZoom: Double, fromZoom: Double): Double = js.native
  def getScaleZoom(scale: Double, fromZoom: Double): Double = js.native
  def project(latlng: Leaflet.LatLngExpression, zoom: Double): Point = js.native
  def unproject(point: Leaflet.PointExpression, zoom: Double): LatLng = js.native
  def layerPointToLatLng(point: Leaflet.PointExpression): LatLng = js.native
  def latLngToLayerPoint(latlng: Leaflet.LatLngExpression): Point = js.native
  def wrapLatLng(latlng: Leaflet.LatLngExpression): LatLng = js.native
  def wrapLatLngBounds(bounds: LatLngBounds): LatLngBounds = js.native
  def distance(latlng1: Leaflet.LatLngExpression, latlng2: Leaflet.LatLngExpression): Double = js.native
  def containerPointToLayerPoint(point: Leaflet.PointExpression): Point = js.native
  def containerPointToLatLng(point: Leaflet.PointExpression): LatLng = js.native
  def layerPointToContainerPoint(point: Leaflet.PointExpression): Point = js.native
  def latLngToContainerPoint(latlng: Leaflet.LatLngExpression): Point = js.native
  def mouseEventToContainerPoint(ev: MouseEvent): Point = js.native
  def mouseEventToLayerPoint(ev: MouseEvent): Point = js.native
  def mouseEventToLatLng(ev: MouseEvent): LatLng = js.native
  def locate(options: LocateOptions = ???): this.type = js.native
  def stopLocate(): this.type = js.native
  var boxZoom: Handler = js.native
  var doubleClickZoom: Handler = js.native
  var dragging: Handler = js.native
  var keyboard: Handler = js.native
  var scrollWheelZoom: Handler = js.native
  var tap: Handler = js.native
  var touchZoom: Handler = js.native
  var zoomControl: Zoom = js.native
  var options: MapOptions = js.native
}

@js.native
trait BaseIconOptions extends LayerOptions {
  var iconUrl: String = js.native
  var iconRetinaUrl: String = js.native
  var iconSize: Leaflet.PointExpression = js.native
  var iconAnchor: Leaflet.PointExpression = js.native
  var popupAnchor: Leaflet.PointExpression = js.native
  var tooltipAnchor: Leaflet.PointExpression = js.native
  var shadowUrl: String = js.native
  var shadowRetinaUrl: String = js.native
  var shadowSize: Leaflet.PointExpression = js.native
  var shadowAnchor: Leaflet.PointExpression = js.native
  var className: String = js.native
}

@js.native
trait IconOptions extends BaseIconOptions {
}

@js.native
@JSGlobal
class Icon[T <: BaseIconOptions] protected () extends Layer {
  def this(options: T) = this()
  def createIcon(oldIcon: HTMLElement = ???): HTMLElement = js.native
  def createShadow(oldIcon: HTMLElement = ???): HTMLElement = js.native
  var options: T = js.native
}


@js.native
trait DefaultIconOptions extends BaseIconOptions {
  var imagePath: String = js.native
}

@js.native
@JSGlobal("Icon.Default")
class Default protected () extends Icon[DefaultIconOptions] {
  def this(options: DefaultIconOptions = ???) = this()
}

@js.native
@JSGlobal("Icon.Default")
object Default extends js.Object {
  var imagePath: String = js.native
}



@js.native
trait DivIconOptions extends BaseIconOptions {
  var html: String | Boolean = js.native
  var bgPos: Leaflet.PointExpression = js.native
}

@js.native
@JSGlobal
class DivIcon protected () extends Icon[DivIconOptions] {
  def this(options: DivIconOptions = ???) = this()
}

@ScalaJSDefined
trait MarkerOptions extends InteractiveLayerOptions {
  val icon: js.UndefOr[Icon[_] | DivIcon] = js.undefined
  val clickable: js.UndefOr[Boolean] = js.undefined
  val draggable: js.UndefOr[Boolean] = js.undefined
  val keyboard: js.UndefOr[Boolean] = js.undefined
  val title: js.UndefOr[String] = js.undefined
  val alt: js.UndefOr[String] = js.undefined
  val zIndexOffset: js.UndefOr[Double] = js.undefined
  val opacity: js.UndefOr[Double] = js.undefined
  val riseOnHover: js.UndefOr[Boolean] = js.undefined
  val riseOffset: js.UndefOr[Double] = js.undefined
  val autoPan: js.UndefOr[Boolean] = js.undefined
  val autoPanSpeed: js.UndefOr[Double] = js.undefined
  val autoPanPadding: js.UndefOr[Leaflet.PointExpression] = js.undefined
}

@js.native
@JSGlobal
class Marker[P] protected () extends Layer {
  def this(latlng: Leaflet.LatLngExpression, options: MarkerOptions = ???) = this()
  def toGeoJSON(): geojson.Feature[geojson.GeoJson.Geometry, P] = js.native
  def getLatLng(): LatLng = js.native
  def setLatLng(latlng: Leaflet.LatLngExpression): this.type = js.native
  def setZIndexOffset(offset: Double): this.type = js.native
  def setIcon(icon: Icon[_] | DivIcon): this.type = js.native
  def setOpacity(opacity: Double): this.type = js.native
  def getElement(): HTMLElement | Unit = js.native
  var options: MarkerOptions = js.native
  var dragging: Handler = js.native
  var feature: geojson.Feature[geojson.GeoJson.Geometry, P] = js.native
}


@js.native
@JSGlobal("Browser")
object Browser extends js.Object {
  val ie: Boolean = js.native
  val ielt9: Boolean = js.native
  val edge: Boolean = js.native
  val webkit: Boolean = js.native
  val gecko: Boolean = js.native
  val android: Boolean = js.native
  val android23: Boolean = js.native
  val chrome: Boolean = js.native
  val safari: Boolean = js.native
  val win: Boolean = js.native
  val ie3d: Boolean = js.native
  val webkit3d: Boolean = js.native
  val gecko3d: Boolean = js.native
  val opera12: Boolean = js.native
  val any3d: Boolean = js.native
  val mobile: Boolean = js.native
  val mobileWebkit: Boolean = js.native
  val mobileWebkit3d: Boolean = js.native
  val mobileOpera: Boolean = js.native
  val mobileGecko: Boolean = js.native
  val touch: Boolean = js.native
  val msPointer: Boolean = js.native
  val pointer: Boolean = js.native
  val retina: Boolean = js.native
  val canvas: Boolean = js.native
  val vml: Boolean = js.native
  val svg: Boolean = js.native
}




@js.native
@JSGlobal("Util")
object Util extends js.Object {
  def extend[D <: js.Object, S1 <: js.Object](dest: D, src: S1 = ???): D with S1 = js.native
  def extend[D <: js.Object, S1 <: js.Object, S2 <: js.Object](dest: D, src1: S1, src2: S2): D with S1 with S2 = js.native
  def extend[D <: js.Object, S1 <: js.Object, S2 <: js.Object, S3 <: js.Object](dest: D, src1: S1, src2: S2, src3: S3): D with S1 with S2 with S3 = js.native
  def extend(dest: js.Any, src: js.Any*): js.Dynamic = js.native
  def create(proto: js.Object | Null, properties: js.Any = ???): js.Dynamic = js.native
  def bind(fn: js.Function0[Unit], obj: js.Any*): js.Function0[Unit] = js.native
  def stamp(obj: js.Any): Double = js.native
  def throttle(fn: js.Function0[Unit], time: Double, context: js.Any): js.Function0[Unit] = js.native
  def wrapNum(num: Double, range: js.Array[Double], includeMax: Boolean = ???): Double = js.native
  def falseFn(): Boolean = js.native
  def formatNum(num: Double, digits: Double = ???): Double = js.native
  def trim(str: String): String = js.native
  def splitWords(str: String): js.Array[String] = js.native
  def setOptions(obj: js.Any, options: js.Any): js.Dynamic = js.native
  def getParamString(obj: js.Any, existingUrl: String = ???, uppercase: Boolean = ???): String = js.native
  def template(str: String, data: js.Any): String = js.native
  def isArray(obj: js.Any): Boolean = js.native
  def indexOf(array: js.Array[js.Any], el: js.Any): Double = js.native
  def requestAnimFrame(fn: js.Function1[Double, Unit], context: js.Any = ???, immediate: Boolean = ???): Double = js.native
  def cancelAnimFrame(id: Double): Unit = js.native
  def lastId: Double = js.native
  def emptyImageUrl: String = js.native
}



@js.native
trait Leaflet extends js.Object {
  type LatLngTuple = js.Tuple2[Double, Double]
  type LatLngExpression = LatLng | LatLngLiteral | LatLngTuple
  def latLng(latitude: Double, longitude: Double, altitude: Double = ???): LatLng = js.native
  def latLng(coords: LatLngTuple | js.Tuple3[Double, Double, Double] | LatLngLiteral | js.Any): LatLng = js.native
  type LatLngBoundsLiteral = js.Array[LatLngTuple]
  type LatLngBoundsExpression = LatLngBounds | LatLngBoundsLiteral
  def latLngBounds(southWest: LatLngExpression, northEast: LatLngExpression): LatLngBounds = js.native
  def latLngBounds(latlngs: js.Array[LatLngExpression]): LatLngBounds = js.native
  type PointTuple = js.Tuple2[Double, Double]
  type PointExpression = Point | PointTuple
  def point(x: Double, y: Double, round: Boolean = ???): Point = js.native
  def point(coords: PointTuple | js.Any): Point = js.native
  type BoundsLiteral = js.Tuple2[PointTuple, PointTuple]
  type BoundsExpression = Bounds | BoundsLiteral
  def bounds(topLeft: PointExpression, bottomRight: PointExpression): Bounds = js.native
  def bounds(points: js.Array[Point] | BoundsLiteral): Bounds = js.native
  type LeafletEventHandlerFn = js.Function1[LeafletEvent, Unit]
  type DoneCallback = js.Function2[Error, HTMLElement, Unit]
  def gridLayer(options: GridLayerOptions = ???): GridLayer = js.native
  def tileLayer(urlTemplate: String, options: TileLayerOptions = ???): TileLayer = js.native
  type CrossOrigin = Boolean | String
  def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions = ???): ImageOverlay = js.native
  def videoOverlay(video: String | js.Array[String] | HTMLVideoElement, bounds: LatLngBoundsExpression, options: VideoOverlayOptions = ???): VideoOverlay = js.native
  type LineCapShape = String
  type LineJoinShape = String
  type FillRule = String
  def polyline(latlngs: js.Array[LatLngExpression] | js.Array[js.Array[LatLngExpression]], options: PolylineOptions = ???): Polyline[_,_] = js.native
  def polygon(latlngs: js.Array[LatLngExpression] | js.Array[js.Array[LatLngExpression]] | js.Array[js.Array[js.Array[LatLngExpression]]], options: PolylineOptions = ???): Polygon[_] = js.native
  def rectangle(latLngBounds: LatLngBoundsExpression, options: PolylineOptions = ???): Rectangle[_] = js.native
  def circleMarker(latlng: LatLngExpression, options: CircleMarkerOptions = ???): CircleMarker[_] = js.native
  def circle(latlng: LatLngExpression, options: CircleMarkerOptions): Circle[_] = js.native
  def circle(latlng: LatLngExpression, radius: Double, options: CircleMarkerOptions ): Circle[_] = js.native
  def svg(options: RendererOptions = ???): SVG = js.native
  def canvas(options: RendererOptions = ???): Canvas = js.native
  def layerGroup(layers: js.Array[Layer] = ???, options: LayerOptions = ???): LayerGroup[_] = js.native
  def featureGroup(layers: js.Array[Layer] = ???): FeatureGroup[_] = js.native
  type StyleFunction[P] = js.Function1[geojson.Feature[geojson.GeoJson.GeometryObject, P], PathOptions]
  def geoJSON[P](_geojson: geojson.GeoJsonObject = ???, options: GeoJSONOptions[P] = ???): GeoJSON[P] = js.native
  type Zoom = Boolean | String
  type ControlPosition = String
  type Content = String | HTMLElement
  def popup(options: PopupOptions = ???, source: Layer = ???): Popup = js.native
  type Direction = String
  def tooltip(options: TooltipOptions = ???, source: Layer = ???): Tooltip = js.native
  def map(element: String | HTMLElement, options: MapOptions = ???): Map = js.native
  def icon(options: IconOptions): Icon[_] = js.native
  def divIcon(options: DivIconOptions = ???): DivIcon = js.native
  def marker(latlng: LatLngExpression, options: MarkerOptions = ???): Marker[_] = js.native
}

@js.native
@JSGlobal("L")
object Leaflet extends Leaflet
