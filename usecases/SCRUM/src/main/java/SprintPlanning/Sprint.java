/**
 */
package SprintPlanning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sprint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SprintPlanning.Sprint#getCommittedItem <em>Committed Item</em>}</li>
 * </ul>
 *
 * @see SprintPlanning.SprintPlanningPackage#getSprint()
 * @model
 * @generated
 */
public interface Sprint extends EObject {
	/**
	 * Returns the value of the '<em><b>Committed Item</b></em>' reference list.
	 * The list contents are of type {@link SprintPlanning.WorkItem}.
	 * It is bidirectional and its opposite is '{@link SprintPlanning.WorkItem#getIsPlannedFor <em>Is Planned For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Committed Item</em>' reference list.
	 * @see SprintPlanning.SprintPlanningPackage#getSprint_CommittedItem()
	 * @see SprintPlanning.WorkItem#getIsPlannedFor
	 * @model opposite="isPlannedFor" required="true"
	 * @generated
	 */
	EList<WorkItem> getCommittedItem();

} // Sprint
