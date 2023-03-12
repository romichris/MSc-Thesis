/*
 * Copyright 2020-2022 Foreseeti AB <https://foreseeti.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mal_lang.langspec;

import static java.util.Objects.requireNonNull;

/**
 * Immutable class representing a field of an asset in a MAL language.
 *
 * @since 1.0.0
 */
public final class Field {
  private final String name;
  private final Asset asset;
  private final Multiplicity multiplicity;
  private Field target;
  private Association association;

  Field(String name, Asset asset, Multiplicity multiplicity) {
    this.name = requireNonNull(name);
    this.asset = requireNonNull(asset);
    this.multiplicity = requireNonNull(multiplicity);
    asset.addField(this);
  }

  /**
   * Returns the name of this {@code Field} object.
   *
   * @return the name of this {@code Field} object
   * @since 1.0.0
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the asset of this {@code Field} object.
   *
   * @return the asset of this {@code Field} object
   * @since 1.0.0
   */
  public Asset getAsset() {
    return this.asset;
  }

  /**
   * Returns the multiplicity of this {@code Field} object.
   *
   * @return the multiplicity of this {@code Field} object
   * @since 1.0.0
   */
  public Multiplicity getMultiplicity() {
    return this.multiplicity;
  }

  /**
   * Returns the target of this {@code Field} object.
   *
   * @return the target of this {@code Field} object
   * @since 1.0.0
   */
  public Field getTarget() {
    return this.target;
  }

  void setTarget(Field target) {
    this.target = requireNonNull(target);
  }

  /**
   * Returns the association of this {@code Field} object.
   *
   * @return the association of this {@code Field} object
   * @since 1.0.0
   */
  public Association getAssociation() {
    return this.association;
  }

  void setAssociation(Association association) {
    this.association = requireNonNull(association);
  }
}
