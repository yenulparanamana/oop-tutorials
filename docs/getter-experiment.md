# Getter Removal Experiment

Endpoint: GET /products/1

Before removal:
- id, name and price were visible.

After removing getName():
- id and price were visible
- name disappeared

After restoring getName():
- All three fields returned

Conclusion:
Jackson uses public getters to read private properties when serializing this object