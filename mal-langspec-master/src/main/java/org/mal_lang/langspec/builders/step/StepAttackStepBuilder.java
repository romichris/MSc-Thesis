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

package org.mal_lang.langspec.builders.step;

import java.util.List;
import java.util.Map;
import org.mal_lang.langspec.Asset;
import org.mal_lang.langspec.builders.AssetBuilder;

/**
 * A builder for creating {@link org.mal_lang.langspec.step.StepAttackStep} objects.
 *
 * @since 1.0.0
 */
public final class StepAttackStepBuilder extends StepReferenceBuilder {
  /**
   * Constructs a new {@code StepAttackStepBuilder} object.
   *
   * @param name the name of the attack step
   * @throws java.lang.NullPointerException if {@code name} is {@code null}
   * @throws java.lang.IllegalArgumentException if {@code name} is not a valid identifier
   * @since 1.0.0
   */
  public StepAttackStepBuilder(String name) {
    super(name);
  }

  @Override
  public Asset getTarget(
      Asset sourceAsset, Map<String, Asset> assets, List<AssetBuilder> assetBuilders) {
    if (!sourceAsset.hasAttackStep(this.getName())) {
      throw new IllegalArgumentException(
          String.format("Attack step %s.%s not found", sourceAsset.getName(), this.getName()));
    }
    return sourceAsset.getAttackStep(this.getName()).getAsset();
  }
}
