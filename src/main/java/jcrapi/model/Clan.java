/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Generated("org.mili.generator")
@Getter
@Setter
@ToString
public class Clan {

  @SerializedName("tag")
  private String tag;

  @SerializedName("name")
  private String name;

  @SerializedName("description")
  private String description;

  @SerializedName("type")
  private String type;

  @SerializedName("score")
  private int score;

  @SerializedName("memberCount")
  private int memberCount;

  @SerializedName("requiredScore")
  private int requiredScore;

  @SerializedName("donations")
  private int donations;

  @SerializedName("warTrophies")
  private int warTrophies;

  @Deprecated
  @SerializedName("clanChest")
  private ClanChest clanChest;

  @SerializedName("badge")
  private Badge badge;

  @SerializedName("location")
  private Location location;

  @SerializedName("tracking")
  private Tracking tracking;

  @SerializedName("members")
  private java.util.List<Member> members;

}