import { u as Is, A, w as ks, x as Oe, B as Ls } from "./indexhtml-Dqry5TTA.js";
/**
 * @license
 * Copyright 2017 Google LLC
 * SPDX-License-Identifier: BSD-3-Clause
 */
class s extends Is {
  constructor(t) {
    if (super(t), this.it = A, t.type !== ks.CHILD)
      throw Error(this.constructor.directiveName + "() can only be used in child bindings");
  }
  render(t) {
    if (t === A || t == null)
      return this._t = void 0, this.it = t;
    if (t === Oe)
      return t;
    if (typeof t != "string")
      throw Error(this.constructor.directiveName + "() called with a non-string value");
    if (t === this.it)
      return this._t;
    this.it = t;
    const i = [t];
    return i.raw = i, this._t = { _$litType$: this.constructor.resultType, strings: i, values: [] };
  }
}
s.directiveName = "unsafeHTML", s.resultType = 1;
const h = Ls(s);
export {
  h
};
