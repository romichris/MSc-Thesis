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

/**
 * Defines APIs for creating and using MAL languages.
 *
 * @since 1.0.0
 */
module org.mal_lang.langspec {
  exports org.mal_lang.langspec;
  exports org.mal_lang.langspec.builders;
  exports org.mal_lang.langspec.builders.step;
  exports org.mal_lang.langspec.io;
  exports org.mal_lang.langspec.step;
  exports org.mal_lang.langspec.ttc;

  requires transitive jakarta.json;
  requires org.leadpony.joy.core;
  requires org.leadpony.justify;
}
