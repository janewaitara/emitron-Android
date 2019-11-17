package com.raywenderlich.emitron.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.raywenderlich.emitron.model.*

/**
 * Entity to store contents to database
 */
@Entity(
  tableName = WatchStat.TABLE_NAME,
  indices = [Index("watched_at", unique = true)]
)
data class WatchStat(

  /**
   * Content id
   */
  @ColumnInfo(name = "content_id")
  val contentId: String,

  /**
   * Duration
   */
  @ColumnInfo(name = "duration")
  val duration: Long,

  /**
   * Watched at in format YYYY-MM-DD-HH
   */
  @PrimaryKey
  @ColumnInfo(name = "watched_at")
  val watchedAt: String,

  /**
   * Updated at
   */
  @ColumnInfo(name = "updated_at")
  val updatedAt: String
) {

  /**
   * Build [Data] from [WatchStat]
   */
  fun toData(): Data = Data(
    type = com.raywenderlich.emitron.model.DataType.WatchStats.toRequestFormat(),
    attributes = Attributes(
      contentId = contentId,
      seconds = duration,
      updatedAt = updatedAt
    )
  )

  companion object {

    /**
     * Table name to store categories
     */
    const val TABLE_NAME: String = "watch_stats"
  }
}
