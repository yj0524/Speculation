package io.github.monun.speculation.game.event

import io.github.monun.speculation.game.Journey
import io.github.monun.speculation.game.Piece
import io.github.monun.speculation.game.zone.Zone
import io.github.monun.speculation.game.zone.ZoneProperty

interface GameEvent

abstract class PieceEvent(val piece: Piece): GameEvent
class PieceTakeTurnEvent(piece: Piece) : PieceEvent(piece)
class PieceTurnOverEvent(piece: Piece) : PieceEvent(piece)
class PieceDepositEvent(piece: Piece, val amount: Int, val zone: Zone): PieceEvent(piece)
class PieceTransferEvent(piece: Piece, val amount: Int, val receiver: Piece, val zone: Zone): PieceEvent(piece)
class PieceWithdrawEvent(piece: Piece, val amount: Int, val zone: Zone): PieceEvent(piece)
class PieceBankruptEvent(piece: Piece) : PieceEvent(piece)
class PieceMoveEvent(piece: Piece, val journey: Journey, val from: Zone, val to: Zone): PieceEvent(piece)
class PieceLeaveEvent(piece: Piece, val journey: Journey, val destination: Zone): PieceEvent(piece)
class PieceArriveEvent(piece: Piece, val journey: Journey, val from: Zone): PieceEvent(piece)
class PieceGambleStartEvent(piece: Piece, val betting: Int, val turns: List<Piece>): PieceEvent(piece)
class PieceGambleEndEvent(val winners: List<Piece>, val losers: List<Piece>): GameEvent
class PieceJailbreakEvent(piece: Piece, val remaining: Int, val success: Boolean): PieceEvent(piece)

abstract class PropertyEvent(val property: ZoneProperty): GameEvent
class PropertyUpdateEvent(property: ZoneProperty, val oldInfo: Pair<Piece, Int>?, val newInfo: Pair<Piece, Int>?) : PropertyEvent(property)
class PropertyUpgradeEvent(property: ZoneProperty, val level: ZoneProperty.Level, val owner: Piece, val piece: Piece) : PropertyEvent(property)
class PropertyAcquisitionEvent(property: ZoneProperty, val from: Piece, val to: Piece) : PropertyEvent(property)
class PropertyClearEvent(property: ZoneProperty, val oldOwner: Piece, val oleLevel: Int) : PropertyEvent(property)

class PropertyAddAmplifierEvent(property: ZoneProperty, val owner: Any, val amplifier: Double, val piece: Piece): PropertyEvent(property)
class PropertyRemoveAmplifierEvent(property: ZoneProperty, val owner: Any, val amplifier: Double, val piece: Piece): PropertyEvent(property)

class GameOverEvent(val winner: Piece?): GameEvent

